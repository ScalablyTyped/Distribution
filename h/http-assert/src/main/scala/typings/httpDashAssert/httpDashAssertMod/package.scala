package typings.httpDashAssert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object httpDashAssertMod {
  /**
    * @param status the status code
    * @param msg the message of the error, defaulting to node's text for that status code
    * @param opts custom properties to attach to the error object
    */
  type Assert = js.Function5[
    /* a */ js.Any, 
    /* b */ js.Any, 
    /* status */ js.UndefOr[Double], 
    /* msg */ js.UndefOr[String], 
    /* opts */ js.UndefOr[js.Object], 
    Unit
  ]
  /**
    * @param status the status code
    * @param msg the message of the error, defaulting to node's text for that status code
    * @param opts custom properties to attach to the error object
    */
  type AssertEqual = js.Function5[
    /* a */ js.Any, 
    /* b */ js.Any, 
    /* status */ js.UndefOr[Double], 
    /* msg */ js.UndefOr[String], 
    /* opts */ js.UndefOr[js.Object], 
    Unit
  ]
  /**
    * @param status the status code
    * @param msg the message of the error, defaulting to node's text for that status code
    * @param opts custom properties to attach to the error object
    */
  type AssertOK = js.Function4[
    /* a */ js.Any, 
    /* status */ js.UndefOr[Double], 
    /* msg */ js.UndefOr[String], 
    /* opts */ js.UndefOr[js.Object], 
    Unit
  ]
}
