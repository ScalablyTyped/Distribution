package typings.lightpick.mod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Locale {
  
  /**
    * Function for calc plural text. More examples for another locales on betsol/numerous.
    *
    * @see https://github.com/betsol/numerous/tree/master/locales
    */
  type PluralizeFn = js.Function2[
    /* i */ java.lang.String | scala.Double, 
    /* locale */ typings.lightpick.mod.Options.Locale.PluralizeFnLocale, 
    java.lang.String
  ]
}
