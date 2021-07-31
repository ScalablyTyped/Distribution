package typings.httpAssert

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(value: js.Any): Unit = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def apply(value: js.Any, status: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(value: js.Any, status: Double, msg: String): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], status.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(value: js.Any, status: Double, msg: String, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], status.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(value: js.Any, status: Double, msg: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], status.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(value: js.Any, status: Double, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], status.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(value: js.Any, status: Unit, msg: String): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], status.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(value: js.Any, status: Unit, msg: String, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], status.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(value: js.Any, status: Unit, msg: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], status.asInstanceOf[js.Any], msg.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(value: js.Any, status: Unit, opts: js.Object): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], status.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("http-assert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("http-assert", "deepEqual")
  @js.native
  val deepEqual: AssertEqual = js.native
  
  @JSImport("http-assert", "equal")
  @js.native
  val equal: Assert = js.native
  
  @JSImport("http-assert", "notDeepEqual")
  @js.native
  val notDeepEqual: AssertEqual = js.native
  
  @JSImport("http-assert", "notEqual")
  @js.native
  val notEqual: Assert = js.native
  
  @JSImport("http-assert", "notStrictEqual")
  @js.native
  val notStrictEqual: AssertEqual = js.native
  
  @JSImport("http-assert", "ok")
  @js.native
  val ok: AssertOK = js.native
  
  @JSImport("http-assert", "strictEqual")
  @js.native
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
