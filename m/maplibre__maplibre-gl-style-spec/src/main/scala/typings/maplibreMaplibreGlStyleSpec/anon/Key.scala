package typings.maplibreMaplibreGlStyleSpec.anon

import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.layout
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.paint
import typings.maplibreMaplibreGlStyleSpec.mod.DataDrivenPropertyValueSpecification
import typings.maplibreMaplibreGlStyleSpec.mod.PropertyValueSpecification
import typings.maplibreMaplibreGlStyleSpec.mod.StylePropertySpecification
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
