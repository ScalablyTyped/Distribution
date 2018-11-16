package typings
package intercomDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object eventMod {
  type EventIdentifier = IntercomUserIdId | UserIdId | EmailIdId
  type ListParam = EventIdentifier with intercomDashClientLib.Anon_Perpage
}
