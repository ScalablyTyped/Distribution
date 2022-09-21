package typings.mathjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Distribution extends StObject {
  
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  def pickRandom(array: Any): Any = js.native
  
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  def random(size: Any): Any = js.native
  def random(size: Any, min: Any): Any = js.native
  def random(size: Any, min: Any, max: Any): Any = js.native
  def random(size: Any, min: scala.Unit, max: Any): Any = js.native
  
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  def randomInt(min: Any): Any = js.native
  def randomInt(min: Any, max: Any): Any = js.native
}
