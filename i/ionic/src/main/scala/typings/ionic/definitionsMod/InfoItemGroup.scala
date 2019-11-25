package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ionic.ionicStrings.ionic
  - typings.ionic.ionicStrings.capacitor
  - typings.ionic.ionicStrings.cordova
  - typings.ionic.ionicStrings.utility
  - typings.ionic.ionicStrings.system
  - typings.ionic.ionicStrings.environment
*/
trait InfoItemGroup extends js.Object

object InfoItemGroup {
  @scala.inline
  def capacitor: typings.ionic.ionicStrings.capacitor = this.cast("capacitor")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cordova: typings.ionic.ionicStrings.cordova = this.cast("cordova")
  @scala.inline
  def environment: typings.ionic.ionicStrings.environment = this.cast("environment")
  @scala.inline
  def ionic: typings.ionic.ionicStrings.ionic = this.cast("ionic")
  @scala.inline
  def system: typings.ionic.ionicStrings.system = this.cast("system")
  @scala.inline
  def utility: typings.ionic.ionicStrings.utility = this.cast("utility")
}

