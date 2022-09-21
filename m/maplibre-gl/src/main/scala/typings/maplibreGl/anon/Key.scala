package typings.maplibreGl.anon

import typings.maplibreGl.maplibreGlStrings.layout_
import typings.maplibreGl.maplibreGlStrings.paint
import typings.maplibreGl.styleSpecMod.DataDrivenPropertyValueSpecification
import typings.maplibreGl.styleSpecMod.PropertyValueSpecification
import typings.maplibreGl.styleSpecMod.StylePropertySpecification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Key extends StObject {
  
  var key: String = js.native
  
  var path: js.Tuple3[String, paint | layout_, String] = js.native
  
  var reference: StylePropertySpecification = js.native
  
  def set(a: DataDrivenPropertyValueSpecification[Any] | PropertyValueSpecification[Any]): Unit = js.native
  
  var value: PropertyValueSpecification[Any] | DataDrivenPropertyValueSpecification[Any] = js.native
}
