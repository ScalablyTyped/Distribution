package typings
package jaegerDashClientLib.jaegerDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reporter extends js.Object {
  def close(): scala.Unit = js.native
  def close(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  // TODO: use span type opentracing.Span from package 'opentracing' which fails DTS linting on import 2019-05-28 jgeth
  def report(
    span: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify opentracing.Span */ js.Any
  ): scala.Unit = js.native
  def setProcess(serviceName: java.lang.String, tags: js.Any): scala.Unit = js.native
}

