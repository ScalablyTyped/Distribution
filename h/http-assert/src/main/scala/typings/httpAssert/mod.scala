package typings.httpAssert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("http-assert", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(value: js.Any): Unit = js.native
  def apply(value: js.Any, status: js.UndefOr[scala.Nothing], msg: js.UndefOr[scala.Nothing], opts: js.Object): Unit = js.native
  def apply(value: js.Any, status: js.UndefOr[scala.Nothing], msg: String): Unit = js.native
  def apply(value: js.Any, status: js.UndefOr[scala.Nothing], msg: String, opts: js.Object): Unit = js.native
  def apply(value: js.Any, status: js.UndefOr[scala.Nothing], opts: js.Object): Unit = js.native
  def apply(value: js.Any, status: Double): Unit = js.native
  def apply(value: js.Any, status: Double, msg: js.UndefOr[scala.Nothing], opts: js.Object): Unit = js.native
  def apply(value: js.Any, status: Double, msg: String): Unit = js.native
  def apply(value: js.Any, status: Double, msg: String, opts: js.Object): Unit = js.native
  def apply(value: js.Any, status: Double, opts: js.Object): Unit = js.native
  
  val deepEqual: AssertEqual = js.native
  
  val equal: Assert = js.native
  
  val notDeepEqual: AssertEqual = js.native
  
  val notEqual: Assert = js.native
  
  val notStrictEqual: AssertEqual = js.native
  
  val ok: AssertOK = js.native
  
  val strictEqual: AssertEqual = js.native
  
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
