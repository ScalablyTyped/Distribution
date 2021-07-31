package typings.mathjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Distribution extends StObject {
  
  def pickRandom(array: js.Any): js.Any = js.native
  
  def random(size: js.Any): js.Any = js.native
  def random(size: js.Any, min: js.Any): js.Any = js.native
  def random(size: js.Any, min: js.Any, max: js.Any): js.Any = js.native
  def random(size: js.Any, min: scala.Unit, max: js.Any): js.Any = js.native
  
  def randomInt(min: js.Any): js.Any = js.native
  def randomInt(min: js.Any, max: js.Any): js.Any = js.native
}
