package typings.lobibox

import typings.lobibox.LobiboxModule.AlertOptions
import typings.lobibox.LobiboxModule.ConfirmOptions
import typings.lobibox.LobiboxModule.LobiboxStatic
import typings.lobibox.LobiboxModule.MessageBoxesDefault
import typings.lobibox.LobiboxModule.MessageBoxesOptions
import typings.lobibox.LobiboxModule.NotifyDefault
import typings.lobibox.LobiboxModule.NotifyOptions
import typings.lobibox.LobiboxModule.ProgressOptions
import typings.lobibox.LobiboxModule.PromptOptions
import typings.lobibox.LobiboxModule.WindowOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var `class`: js.UndefOr[String] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    }
  }
  
  @js.native
  trait Call extends StObject {
    
    def apply[T /* <: MessageBoxesDefault */](`type`: String): LobiboxStatic = js.native
    def apply[T /* <: MessageBoxesDefault */](`type`: String, options: T): LobiboxStatic = js.native
    
    var DEFAULTS: AlertOptions = js.native
  }
  
  @js.native
  trait CallDEFAULTS extends StObject {
    
    def apply[T /* <: MessageBoxesDefault */](`type`: String): LobiboxStatic = js.native
    def apply[T /* <: MessageBoxesDefault */](`type`: String, options: T): LobiboxStatic = js.native
    
    var DEFAULTS: PromptOptions = js.native
  }
  
  @js.native
  trait CallOptions extends StObject {
    
    def apply[T /* <: MessageBoxesDefault */](): T = js.native
    def apply[T /* <: MessageBoxesDefault */](options: ConfirmOptions): T = js.native
    
    var DEFAULTS: ConfirmOptions = js.native
  }
  
  trait Cancel extends StObject {
    
    var cancel: js.UndefOr[Class] = js.undefined
    
    var no: js.UndefOr[Class] = js.undefined
    
    var ok: js.UndefOr[Class] = js.undefined
    
    var yes: js.UndefOr[Class] = js.undefined
  }
  object Cancel {
    
    inline def apply(): Cancel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cancel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cancel] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Class): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setNo(value: Class): Self = StObject.set(x, "no", value.asInstanceOf[js.Any])
      
      inline def setNoUndefined: Self = StObject.set(x, "no", js.undefined)
      
      inline def setOk(value: Class): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      inline def setOkUndefined: Self = StObject.set(x, "ok", js.undefined)
      
      inline def setYes(value: Class): Self = StObject.set(x, "yes", value.asInstanceOf[js.Any])
      
      inline def setYesUndefined: Self = StObject.set(x, "yes", js.undefined)
    }
  }
  
  trait Class extends StObject {
    
    var `class`: js.UndefOr[String] = js.undefined
    
    var closeOnClick: js.UndefOr[Boolean] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object Class {
    
    inline def apply(): Class = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Class]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Class] (val x: Self) extends AnyVal {
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      inline def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
      
      inline def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait Confirm extends StObject {
    
    var default: js.UndefOr[String] = js.undefined
    
    var confirm: js.UndefOr[String] = js.undefined
    
    var error: js.UndefOr[String] = js.undefined
    
    var info: js.UndefOr[String] = js.undefined
    
    var progress: js.UndefOr[String] = js.undefined
    
    var prompt: js.UndefOr[String] = js.undefined
    
    var success: js.UndefOr[String] = js.undefined
    
    var warning: js.UndefOr[String] = js.undefined
    
    var window: js.UndefOr[String] = js.undefined
  }
  object Confirm {
    
    inline def apply(): Confirm = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Confirm]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Confirm] (val x: Self) extends AnyVal {
      
      inline def setConfirm(value: String): Self = StObject.set(x, "confirm", value.asInstanceOf[js.Any])
      
      inline def setConfirmUndefined: Self = StObject.set(x, "confirm", js.undefined)
      
      inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setProgress(value: String): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      inline def setSuccess(value: String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
      
      inline def setWindow(value: String): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
  
  trait DEFAULTS extends StObject {
    
    var DEFAULTS: MessageBoxesDefault
    
    var OPTIONS: MessageBoxesOptions
  }
  object DEFAULTS {
    
    inline def apply(DEFAULTS: MessageBoxesDefault, OPTIONS: MessageBoxesOptions): DEFAULTS = {
      val __obj = js.Dynamic.literal(DEFAULTS = DEFAULTS.asInstanceOf[js.Any], OPTIONS = OPTIONS.asInstanceOf[js.Any])
      __obj.asInstanceOf[DEFAULTS]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DEFAULTS] (val x: Self) extends AnyVal {
      
      inline def setDEFAULTS(value: MessageBoxesDefault): Self = StObject.set(x, "DEFAULTS", value.asInstanceOf[js.Any])
      
      inline def setOPTIONS(value: MessageBoxesOptions): Self = StObject.set(x, "OPTIONS", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DEFAULTSProgressOptions extends StObject {
    
    def apply[T /* <: MessageBoxesDefault */](options: ProgressOptions): T = js.native
    
    var DEFAULTS: ProgressOptions = js.native
  }
  
  @js.native
  trait DEFAULTSWindowOptions extends StObject {
    
    def apply[T /* <: MessageBoxesDefault */](options: WindowOptions): T = js.native
    
    var DEFAULTS: WindowOptions = js.native
  }
  
  trait Icon extends StObject {
    
    var `class`: js.UndefOr[String] = js.undefined
    
    var icon: js.UndefOr[String] = js.undefined
    
    var sound: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object Icon {
    
    inline def apply(): Icon = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Icon]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Icon] (val x: Self) extends AnyVal {
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setSound(value: String): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
      
      inline def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait IconClass extends StObject {
    
    var iconClass: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object IconClass {
    
    inline def apply(): IconClass = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconClass]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IconClass] (val x: Self) extends AnyVal {
      
      inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
      
      inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait OPTIONS extends StObject {
    
    def apply[T /* <: NotifyDefault */](`type`: String): T = js.native
    def apply[T /* <: NotifyDefault */](`type`: String, options: NotifyOptions): T = js.native
    
    var DEFAULTS: js.UndefOr[NotifyDefault] = js.native
    
    var OPTIONS: js.UndefOr[NotifyOptions] = js.native
  }
  
  trait Width extends StObject {
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object Width {
    
    inline def apply(): Width = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Width]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Width] (val x: Self) extends AnyVal {
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
