package typings.ionicAngular

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/navigation/nav-params", JSImport.Namespace)
@js.native
object navParamsMod extends js.Object {
  
  @js.native
  class NavParams () extends js.Object {
    def this(data: StringDictionary[js.Any]) = this()
    
    var data: StringDictionary[js.Any] = js.native
    
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
    def get[T](param: String): T = js.native
  }
}
