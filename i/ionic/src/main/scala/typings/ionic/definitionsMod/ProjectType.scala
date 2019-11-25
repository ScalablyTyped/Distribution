package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ionic.ionicStrings.angular
  - typings.ionic.ionicStrings.`ionic-angular`
  - typings.ionic.ionicStrings.ionic1
  - typings.ionic.ionicStrings.custom
  - typings.ionic.ionicStrings.bare
  - typings.ionic.ionicStrings.react
  - typings.ionic.ionicStrings.vue
*/
trait ProjectType extends js.Object

object ProjectType {
  @scala.inline
  def angular: typings.ionic.ionicStrings.angular = this.cast("angular")
  @scala.inline
  def bare: typings.ionic.ionicStrings.bare = this.cast("bare")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def custom: typings.ionic.ionicStrings.custom = this.cast("custom")
  @scala.inline
  def `ionic-angular`: typings.ionic.ionicStrings.`ionic-angular` = this.cast("ionic-angular")
  @scala.inline
  def ionic1: typings.ionic.ionicStrings.ionic1 = this.cast("ionic1")
  @scala.inline
  def react: typings.ionic.ionicStrings.react = this.cast("react")
  @scala.inline
  def vue: typings.ionic.ionicStrings.vue = this.cast("vue")
}

