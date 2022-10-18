package typings.maplibreGl.anon

import typings.maplibreGl.distStyleSpecMod.DataDrivenPropertyValueSpecification
import typings.maplibreGl.distStyleSpecMod.PropertyValueSpecification
import typings.maplibreGl.distStyleSpecMod.StylePropertySpecification
import typings.maplibreGl.maplibreGlStrings.layout
import typings.maplibreGl.maplibreGlStrings.paint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Key extends StObject {
  
  var key: String = js.native
  
  var path: js.Tuple3[String, paint | layout, String] = js.native
  
  var reference: StylePropertySpecification = js.native
  
  def set(a: DataDrivenPropertyValueSpecification[Any] | PropertyValueSpecification[Any]): Unit = js.native
  
  var value: PropertyValueSpecification[Any] | DataDrivenPropertyValueSpecification[Any] = js.native
}
