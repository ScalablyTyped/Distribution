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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject {
    
    var `class`: js.UndefOr[String] = js.native
  }
  object `0` {
    
    @scala.inline
    def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
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
  
  @js.native
  trait Cancel extends StObject {
    
    var cancel: js.UndefOr[Class] = js.native
    
    var no: js.UndefOr[Class] = js.native
    
    var ok: js.UndefOr[Class] = js.native
    
    var yes: js.UndefOr[Class] = js.native
  }
  object Cancel {
    
    @scala.inline
    def apply(): Cancel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cancel]
    }
    
    @scala.inline
    implicit class CancelMutableBuilder[Self <: Cancel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Class): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setNo(value: Class): Self = StObject.set(x, "no", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoUndefined: Self = StObject.set(x, "no", js.undefined)
      
      @scala.inline
      def setOk(value: Class): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkUndefined: Self = StObject.set(x, "ok", js.undefined)
      
      @scala.inline
      def setYes(value: Class): Self = StObject.set(x, "yes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYesUndefined: Self = StObject.set(x, "yes", js.undefined)
    }
  }
  
  @js.native
  trait Class extends StObject {
    
    var `class`: js.UndefOr[String] = js.native
    
    var closeOnClick: js.UndefOr[Boolean] = js.native
    
    var text: js.UndefOr[String] = js.native
  }
  object Class {
    
    @scala.inline
    def apply(): Class = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Class]
    }
    
    @scala.inline
    implicit class ClassMutableBuilder[Self <: Class] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      @scala.inline
      def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait Confirm extends StObject {
    
    var default: js.UndefOr[String] = js.native
    
    var confirm: js.UndefOr[String] = js.native
    
    var error: js.UndefOr[String] = js.native
    
    var info: js.UndefOr[String] = js.native
    
    var progress: js.UndefOr[String] = js.native
    
    var prompt: js.UndefOr[String] = js.native
    
    var success: js.UndefOr[String] = js.native
    
    var warning: js.UndefOr[String] = js.native
    
    var window: js.UndefOr[String] = js.native
  }
  object Confirm {
    
    @scala.inline
    def apply(): Confirm = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Confirm]
    }
    
    @scala.inline
    implicit class ConfirmMutableBuilder[Self <: Confirm] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfirm(value: String): Self = StObject.set(x, "confirm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfirmUndefined: Self = StObject.set(x, "confirm", js.undefined)
      
      @scala.inline
      def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      @scala.inline
      def setProgress(value: String): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      @scala.inline
      def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      @scala.inline
      def setSuccess(value: String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      @scala.inline
      def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
      
      @scala.inline
      def setWindow(value: String): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
  
  @js.native
  trait DEFAULTS extends StObject {
    
    var DEFAULTS: MessageBoxesDefault = js.native
    
    var OPTIONS: MessageBoxesOptions = js.native
  }
  object DEFAULTS {
    
    @scala.inline
    def apply(DEFAULTS: MessageBoxesDefault, OPTIONS: MessageBoxesOptions): DEFAULTS = {
      val __obj = js.Dynamic.literal(DEFAULTS = DEFAULTS.asInstanceOf[js.Any], OPTIONS = OPTIONS.asInstanceOf[js.Any])
      __obj.asInstanceOf[DEFAULTS]
    }
    
    @scala.inline
    implicit class DEFAULTSMutableBuilder[Self <: DEFAULTS] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDEFAULTS(value: MessageBoxesDefault): Self = StObject.set(x, "DEFAULTS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOPTIONS(value: MessageBoxesOptions): Self = StObject.set(x, "OPTIONS", value.asInstanceOf[js.Any])
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
  
  @js.native
  trait Icon extends StObject {
    
    var `class`: js.UndefOr[String] = js.native
    
    var icon: js.UndefOr[String] = js.native
    
    var sound: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object Icon {
    
    @scala.inline
    def apply(): Icon = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Icon]
    }
    
    @scala.inline
    implicit class IconMutableBuilder[Self <: Icon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setSound(value: String): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait IconClass extends StObject {
    
    var iconClass: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object IconClass {
    
    @scala.inline
    def apply(): IconClass = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconClass]
    }
    
    @scala.inline
    implicit class IconClassMutableBuilder[Self <: IconClass] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait OPTIONS extends StObject {
    
    def apply[T /* <: NotifyDefault */](`type`: String): T = js.native
    def apply[T /* <: NotifyDefault */](`type`: String, options: NotifyOptions): T = js.native
    
    var DEFAULTS: js.UndefOr[NotifyDefault] = js.native
    
    var OPTIONS: js.UndefOr[NotifyOptions] = js.native
  }
  
  @js.native
  trait Width extends StObject {
    
    var width: js.UndefOr[Double] = js.native
  }
  object Width {
    
    @scala.inline
    def apply(): Width = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Width]
    }
    
    @scala.inline
    implicit class WidthMutableBuilder[Self <: Width] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
