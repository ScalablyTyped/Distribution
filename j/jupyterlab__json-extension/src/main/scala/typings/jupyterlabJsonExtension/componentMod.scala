package typings.jupyterlabJsonExtension

import typings.luminoCoreutils.jsonMod.JSONObject
import typings.luminoCoreutils.jsonMod.JSONValue
import typings.react.mod.ChangeEvent
import typings.std.HTMLInputElement
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@jupyterlab/json-extension/lib/component", "Component")
  @js.native
  class Component protected ()
    extends typings.react.mod.Component[IProps, IState, js.Any] {
    def this(props: IProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IProps, context: js.Any) = this()
    
    def handleChange(event: ChangeEvent[HTMLInputElement]): Unit = js.native
    
    var timer: Double = js.native
  }
  
  @js.native
  trait IProps extends StObject {
    
    var data: NonNullable[JSONValue] = js.native
    
    var metadata: js.UndefOr[JSONObject] = js.native
  }
  object IProps {
    
    @scala.inline
    def apply(): IProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IProps]
    }
    
    @scala.inline
    implicit class IPropsMutableBuilder[Self <: IProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: NonNullable[JSONValue]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataNull: Self = StObject.set(x, "data", null)
      
      @scala.inline
      def setMetadata(value: JSONObject): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    }
  }
  
  @js.native
  trait IState extends StObject {
    
    var filter: js.UndefOr[String] = js.native
    
    var value: String = js.native
  }
  object IState {
    
    @scala.inline
    def apply(value: String): IState = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IState]
    }
    
    @scala.inline
    implicit class IStateMutableBuilder[Self <: IState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
