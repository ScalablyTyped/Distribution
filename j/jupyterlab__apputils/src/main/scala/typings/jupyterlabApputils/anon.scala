package typings.jupyterlabApputils

import typings.jupyterlabApputils.jupyterlabApputilsStrings.default
import typings.jupyterlabApputils.jupyterlabApputilsStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Above extends StObject {
    
    var above: js.UndefOr[Double] = js.undefined
    
    var below: js.UndefOr[Double] = js.undefined
  }
  object Above {
    
    inline def apply(): Above = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Above]
    }
    
    extension [Self <: Above](x: Self) {
      
      inline def setAbove(value: Double): Self = StObject.set(x, "above", value.asInstanceOf[js.Any])
      
      inline def setAboveUndefined: Self = StObject.set(x, "above", js.undefined)
      
      inline def setBelow(value: Double): Self = StObject.set(x, "below", value.asInstanceOf[js.Any])
      
      inline def setBelowUndefined: Self = StObject.set(x, "below", js.undefined)
    }
  }
  
  trait Horizontal extends StObject {
    
    var horizontal: js.UndefOr[Double] = js.undefined
    
    var vertical: js.UndefOr[Above] = js.undefined
  }
  object Horizontal {
    
    inline def apply(): Horizontal = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Horizontal]
    }
    
    extension [Self <: Horizontal](x: Self) {
      
      inline def setHorizontal(value: Double): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setVertical(value: Above): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@jupyterlab/apputils.@jupyterlab/apputils/lib/dialog.Dialog.IButton> */
  trait PartialIButton extends StObject {
    
    var accept: js.UndefOr[Boolean] = js.undefined
    
    var caption: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var displayType: js.UndefOr[default | warn] = js.undefined
    
    var iconClass: js.UndefOr[String] = js.undefined
    
    var iconLabel: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
  }
  object PartialIButton {
    
    inline def apply(): PartialIButton = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIButton]
    }
    
    extension [Self <: PartialIButton](x: Self) {
      
      inline def setAccept(value: Boolean): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisplayType(value: default | warn): Self = StObject.set(x, "displayType", value.asInstanceOf[js.Any])
      
      inline def setDisplayTypeUndefined: Self = StObject.set(x, "displayType", js.undefined)
      
      inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
      
      inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
      
      inline def setIconLabel(value: String): Self = StObject.set(x, "iconLabel", value.asInstanceOf[js.Any])
      
      inline def setIconLabelUndefined: Self = StObject.set(x, "iconLabel", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@jupyterlab/services.@jupyterlab/services.Kernel.IModel> */
  trait PartialIModel extends StObject {
    
    var id: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
  }
  object PartialIModel {
    
    inline def apply(): PartialIModel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIModel]
    }
    
    extension [Self <: PartialIModel](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<@jupyterlab/apputils.@jupyterlab/apputils/lib/dialog.Dialog.IButton> */
  trait ReadonlyIButton extends StObject {
    
    val accept: Boolean
    
    val caption: String
    
    val className: String
    
    val displayType: default | warn
    
    val iconClass: String
    
    val iconLabel: String
    
    val label: String
  }
  object ReadonlyIButton {
    
    inline def apply(
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
    
    extension [Self <: ReadonlyIButton](x: Self) {
      
      inline def setAccept(value: Boolean): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setDisplayType(value: default | warn): Self = StObject.set(x, "displayType", value.asInstanceOf[js.Any])
      
      inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
      
      inline def setIconLabel(value: String): Self = StObject.set(x, "iconLabel", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
}
