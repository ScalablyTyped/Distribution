package typings.intlifyCoreBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluralizationRule extends StObject {
  
  def apply(choice: Double, choicesLength: Double): Double = js.native
  def apply(choice: Double, choicesLength: Double, orgRule: PluralizationRule): Double = js.native
}
