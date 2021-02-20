package typings.jupyterlabApputils

import typings.jupyterlabApputils.jupyterlabApputilsStrings.default
import typings.jupyterlabApputils.jupyterlabApputilsStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Above extends StObject {
    
    var above: js.UndefOr[Double] = js.native
    
    var below: js.UndefOr[Double] = js.native
  }
  object Above {
    
    @scala.inline
    def apply(): Above = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Above]
    }
    
    @scala.inline
    implicit class AboveMutableBuilder[Self <: Above] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbove(value: Double): Self = StObject.set(x, "above", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAboveUndefined: Self = StObject.set(x, "above", js.undefined)
      
      @scala.inline
      def setBelow(value: Double): Self = StObject.set(x, "below", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBelowUndefined: Self = StObject.set(x, "below", js.undefined)
    }
  }
  
  @js.native
  trait Horizontal extends StObject {
    
    var horizontal: js.UndefOr[Double] = js.native
    
    var vertical: js.UndefOr[Above] = js.native
  }
  object Horizontal {
    
    @scala.inline
    def apply(): Horizontal = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Horizontal]
    }
    
    @scala.inline
    implicit class HorizontalMutableBuilder[Self <: Horizontal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHorizontal(value: Double): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      @scala.inline
      def setVertical(value: Above): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@jupyterlab/apputils.@jupyterlab/apputils/lib/dialog.Dialog.IButton> */
  @js.native
  trait PartialIButton extends StObject {
    
    var accept: js.UndefOr[Boolean] = js.native
    
    var caption: js.UndefOr[String] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var displayType: js.UndefOr[default | warn] = js.native
    
    var iconClass: js.UndefOr[String] = js.native
    
    var iconLabel: js.UndefOr[String] = js.native
    
    var label: js.UndefOr[String] = js.native
  }
  object PartialIButton {
    
    @scala.inline
    def apply(): PartialIButton = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIButton]
    }
    
    @scala.inline
    implicit class PartialIButtonMutableBuilder[Self <: PartialIButton] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccept(value: Boolean): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      @scala.inline
      def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisplayType(value: default | warn): Self = StObject.set(x, "displayType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayTypeUndefined: Self = StObject.set(x, "displayType", js.undefined)
      
      @scala.inline
      def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
      
      @scala.inline
      def setIconLabel(value: String): Self = StObject.set(x, "iconLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconLabelUndefined: Self = StObject.set(x, "iconLabel", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@jupyterlab/services.@jupyterlab/services.Kernel.IModel> */
  @js.native
  trait PartialIModel extends StObject {
    
    var id: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
  }
  object PartialIModel {
    
    @scala.inline
    def apply(): PartialIModel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIModel]
    }
    
    @scala.inline
    implicit class PartialIModelMutableBuilder[Self <: PartialIModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<@jupyterlab/apputils.@jupyterlab/apputils/lib/dialog.Dialog.IButton> */
  @js.native
  trait ReadonlyIButton extends StObject {
    
    val accept: Boolean = js.native
    
    val caption: String = js.native
    
    val className: String = js.native
    
    val displayType: default | warn = js.native
    
    val iconClass: String = js.native
    
    val iconLabel: String = js.native
    
    val label: String = js.native
  }
  object ReadonlyIButton {
    
    @scala.inline
    def apply(
      accept: Boolean,
      caption: String,
      className: String,
      displayType: default | warn,
      iconClass: String,
      iconLabel: String,
      label: String
    ): ReadonlyIButton = {
      val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], displayType = displayType.asInstanceOf[js.Any], iconClass = iconClass.asInstanceOf[js.Any], iconLabel = iconLabel.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyIButton]
    }
    
    @scala.inline
    implicit class ReadonlyIButtonMutableBuilder[Self <: ReadonlyIButton] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccept(value: Boolean): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayType(value: default | warn): Self = StObject.set(x, "displayType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconLabel(value: String): Self = StObject.set(x, "iconLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
}
