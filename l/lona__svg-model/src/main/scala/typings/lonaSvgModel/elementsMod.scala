package typings.lonaSvgModel

import typings.lonaSvgModel.anon.Height
import typings.lonaSvgModel.anon.UnsupportedFeatures
import typings.lonaSvgModel.commandsMod.Command
import typings.lonaSvgModel.commandsMod.QuadCurve_
import typings.lonaSvgModel.primitivesMod.Rect_
import typings.lonaSvgModel.styleMod.Style_
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elementsMod {
  
  @JSImport("@lona/svg-model/lib/elements", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def path(style: Style_, commands: js.Array[Command]): Path_ = (^.asInstanceOf[js.Dynamic].applyDynamic("path")(style.asInstanceOf[js.Any], commands.asInstanceOf[js.Any])).asInstanceOf[Path_]
  
  inline def svg(attributes: Height, unsupportedFeatures: js.Array[String]): SVG_ = (^.asInstanceOf[js.Dynamic].applyDynamic("svg")(attributes.asInstanceOf[js.Any], unsupportedFeatures.asInstanceOf[js.Any])).asInstanceOf[SVG_]
  
  type CommandWithoutQuadratics = Exclude[Command, QuadCurve_]
  
  /* Inlined std.Omit<@lona/svg-model.@lona/svg-model/lib/elements.Path, 'commands'> & {  commands :std.Array<@lona/svg-model.@lona/svg-model/lib/elements.CommandWithoutQuadratics>} */
  trait PathWithoutQuadratics extends StObject {
    
    var commands: js.Array[CommandWithoutQuadratics]
    
    var id: String
    
    var style: Style_
  }
  object PathWithoutQuadratics {
    
    inline def apply(commands: js.Array[CommandWithoutQuadratics], id: String, style: Style_): PathWithoutQuadratics = {
      val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathWithoutQuadratics]
    }
    
    extension [Self <: PathWithoutQuadratics](x: Self) {
      
      inline def setCommands(value: js.Array[CommandWithoutQuadratics]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      inline def setCommandsVarargs(value: CommandWithoutQuadratics*): Self = StObject.set(x, "commands", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: Style_): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  trait Path_ extends StObject {
    
    var commands: js.Array[Command]
    
    var id: String
    
    var style: Style_
  }
  object Path_ {
    
    inline def apply(commands: js.Array[Command], id: String, style: Style_): Path_ = {
      val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path_]
    }
    
    extension [Self <: Path_](x: Self) {
      
      inline def setCommands(value: js.Array[Command]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      inline def setCommandsVarargs(value: Command*): Self = StObject.set(x, "commands", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: Style_): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<@lona/svg-model.@lona/svg-model/lib/elements.SVG, 'children'> & {  children :std.Array<@lona/svg-model.@lona/svg-model/lib/elements.PathWithoutQuadratics>} */
  trait SVGWithoutQuadratics extends StObject {
    
    var children: js.Array[PathWithoutQuadratics]
    
    var height: js.UndefOr[Double] = js.undefined
    
    var metadata: UnsupportedFeatures
    
    var viewBox: js.UndefOr[Rect_] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object SVGWithoutQuadratics {
    
    inline def apply(children: js.Array[PathWithoutQuadratics], metadata: UnsupportedFeatures): SVGWithoutQuadratics = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[SVGWithoutQuadratics]
    }
    
    extension [Self <: SVGWithoutQuadratics](x: Self) {
      
      inline def setChildren(value: js.Array[PathWithoutQuadratics]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: PathWithoutQuadratics*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setMetadata(value: UnsupportedFeatures): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setViewBox(value: Rect_): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      inline def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait SVG_ extends StObject {
    
    var children: js.Array[Path_]
    
    var height: js.UndefOr[Double] = js.undefined
    
    var metadata: UnsupportedFeatures
    
    var viewBox: js.UndefOr[Rect_] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object SVG_ {
    
    inline def apply(children: js.Array[Path_], metadata: UnsupportedFeatures): SVG_ = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[SVG_]
    }
    
    extension [Self <: SVG_](x: Self) {
      
      inline def setChildren(value: js.Array[Path_]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: Path_ *): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setMetadata(value: UnsupportedFeatures): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setViewBox(value: Rect_): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      inline def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
