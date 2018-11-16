package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IAilment extends js.Object {
  val id: java.lang.String
  var `implicit`: scala.Boolean
  var projects: js.UndefOr[js.Array[ProjectType]] = js.undefined
  def detected(): stdLib.Promise[scala.Boolean]
  def getMessage(): stdLib.Promise[java.lang.String]
  def getTreatmentSteps(): stdLib.Promise[js.Array[PatientTreatmentStep]]
}

