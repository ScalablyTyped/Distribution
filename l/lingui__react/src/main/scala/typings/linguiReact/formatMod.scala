package typings.linguiReact

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatMod {
  
  @JSImport("@lingui/react/cjs/format", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * `formatElements` - parse string and return tree of react elements
    *
    * `value` is string to be formatted with <0>Paired<0/> or <0/> (unpaired)
    * placeholders. `elements` is a array of react elements which indexes
    * correspond to element indexes in formatted string
    */
  inline def formatElements(value: String): String | js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("formatElements")(value.asInstanceOf[js.Any]).asInstanceOf[String | js.Array[Any]]
  inline def formatElements(value: String, elements: StringDictionary[ReactElement]): String | js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatElements")(value.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[Any]]
}
