package typings.jaegerClient.mod

import typings.opentracing.mod.Span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reporter extends StObject {
  
  def close(): Unit = js.native
  def close(callback: js.Function0[Unit]): Unit = js.native
  
  // TODO: use span type opentracing.Span from package 'opentracing' which fails DTS linting on import 2019-05-28 jgeth
  def report(span: Span): Unit = js.native
  
  def setProcess(serviceName: String, tags: js.Any): Unit = js.native
}
