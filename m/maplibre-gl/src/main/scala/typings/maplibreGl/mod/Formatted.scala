package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "Formatted")
@js.native
open class Formatted protected ()
  extends StObject
     with _Value {
  def this(sections: js.Array[FormattedSection]) = this()
  
  def isEmpty(): Boolean = js.native
  
  var sections: js.Array[FormattedSection] = js.native
}
/* static members */
object Formatted {
  
  @JSImport("maplibre-gl", "Formatted")
  @js.native
  val ^ : js.Any = js.native
  
  inline def factory(text: String): Formatted = ^.asInstanceOf[js.Dynamic].applyDynamic("factory")(text.asInstanceOf[js.Any]).asInstanceOf[Formatted]
  inline def factory(text: Formatted): Formatted = ^.asInstanceOf[js.Dynamic].applyDynamic("factory")(text.asInstanceOf[js.Any]).asInstanceOf[Formatted]
  
  inline def fromString(unformatted: String): Formatted = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(unformatted.asInstanceOf[js.Any]).asInstanceOf[Formatted]
}
