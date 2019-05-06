package typings
package atIonicAngularLib.distDirectivesNavigationNavDashParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/navigation/nav-params", "NavParams")
@js.native
class NavParams () extends js.Object {
  def this(data: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  var data: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /**
    * Get the value of a nav-parameter for the current view
    *
    * ```ts
    * import { NavParams } from 'ionic-angular';
    *
    * export class MyClass{
    *  constructor(public navParams: NavParams){
    *    // userParams is an object we have in our nav-parameters
    *    this.navParams.get('userParams');
    *  }
    * }
    * ```
    *
    * @param param Which param you want to look up
    */
  def get(param: java.lang.String): js.Any = js.native
}

