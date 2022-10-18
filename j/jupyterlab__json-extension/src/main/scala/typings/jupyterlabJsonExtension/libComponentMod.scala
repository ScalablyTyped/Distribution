package typings.jupyterlabJsonExtension

import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.luminoCoreutils.typesJsonMod.JSONObject
import typings.luminoCoreutils.typesJsonMod.JSONValue
import typings.react.mod.ChangeEvent
import typings.std.HTMLInputElement
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentMod {
  
  @JSImport("@jupyterlab/json-extension/lib/component", "Component")
  @js.native
  open class Component protected ()
    extends typings.react.mod.Component[IProps, IState, Any] {
    def this(props: IProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IProps, context: Any) = this()
    
    def handleChange(event: ChangeEvent[HTMLInputElement]): Unit = js.native
    
    var timer: Double = js.native
  }
  
  trait IProps extends StObject {
    
    var data: NonNullable[JSONValue]
    
    var metadata: js.UndefOr[JSONObject] = js.undefined
    
    /**
      * The application language translator.
      */
    var translator: js.UndefOr[ITranslator] = js.undefined
  }
  object IProps {
    
    inline def apply(data: NonNullable[JSONValue]): IProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[IProps]
    }
    
    extension [Self <: IProps](x: Self) {
      
      inline def setData(value: NonNullable[JSONValue]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: JSONObject): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
      
      inline def setTranslatorUndefined: Self = StObject.set(x, "translator", js.undefined)
    }
  }
  
  trait IState extends StObject {
    
    var filter: js.UndefOr[String] = js.undefined
    
    var value: String
  }
  object IState {
    
    inline def apply(value: String): IState = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IState]
    }
    
    extension [Self <: IState](x: Self) {
      
      inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
