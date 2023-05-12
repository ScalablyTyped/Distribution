package typings.mapboxMapboxGlDraw.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringSet extends StObject {
  
  def add(x: String): StringSet = js.native
  def add(x: Double): StringSet = js.native
  
  def clear(): StringSet = js.native
  
  def delete(x: String): StringSet = js.native
  def delete(x: Double): StringSet = js.native
  
  def has(x: String): Boolean = js.native
  def has(x: Double): Boolean = js.native
  
  def values(): String | js.Array[Double] = js.native
}
