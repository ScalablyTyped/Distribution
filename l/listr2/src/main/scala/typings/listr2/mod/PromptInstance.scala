package typings.listr2.mod

import typings.node.processMod.global.NodeJS.ReadStream
import typings.node.processMod.global.NodeJS.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<listr2.listr2.BasePromptOptions, 'onCancel' | 'onSubmit'> */
@js.native
trait PromptInstance extends StObject {
  
  def cancel(): Unit = js.native
  def cancel(err: String): Unit = js.native
  
  var footer: js.UndefOr[String] = js.native
  
  var format: js.UndefOr[js.Function1[/* value */ Any, Any | js.Promise[Any]]] = js.native
  
  var header: js.UndefOr[String] = js.native
  
  var initial: js.UndefOr[
    Boolean | Double | js.Array[Double] | String | (js.Function0[js.Promise[String] | String])
  ] = js.native
  
  var message: String | (js.Function0[js.Promise[String] | String]) = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var result: js.UndefOr[js.Function1[/* value */ Any, Any | js.Promise[Any]]] = js.native
  
  var skip: js.UndefOr[js.Function1[/* value */ Any, Boolean | js.Promise[Boolean]]] = js.native
  
  var stdin: js.UndefOr[ReadStream] = js.native
  
  var stdout: js.UndefOr[WriteStream] = js.native
  
  def submit(): Unit = js.native
  
  var validate: js.UndefOr[
    js.Function2[/* value */ Any, /* state */ Any, Boolean | (js.Promise[Boolean | String]) | String]
  ] = js.native
}
