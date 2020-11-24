package typings.hoxy

import typings.hoxy.mod.BodyParser
import typings.hoxy.mod.HttpMethod
import typings.hoxy.mod.LogLevel
import typings.hoxy.mod.Phase
import typings.hoxy.mod.ServeStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hoxyStrings {
  
  @scala.inline
  def $: $ = "$".asInstanceOf[$]
  
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  
  @scala.inline
  def PATCH: PATCH = "PATCH".asInstanceOf[PATCH]
  
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @scala.inline
  def buffer: buffer = "buffer".asInstanceOf[buffer]
  
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  
  @scala.inline
  def mirror: mirror = "mirror".asInstanceOf[mirror]
  
  @scala.inline
  def overlay: overlay = "overlay".asInstanceOf[overlay]
  
  @scala.inline
  def params: params = "params".asInstanceOf[params]
  
  @scala.inline
  def replace: replace = "replace".asInstanceOf[replace]
  
  @scala.inline
  def request: request = "request".asInstanceOf[request]
  
  @scala.inline
  def `request-sent`: `request-sent` = "request-sent".asInstanceOf[`request-sent`]
  
  @scala.inline
  def response: response = "response".asInstanceOf[response]
  
  @scala.inline
  def `response-sent`: `response-sent` = "response-sent".asInstanceOf[`response-sent`]
  
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
  
  @js.native
  sealed trait $ extends BodyParser
  
  @js.native
  sealed trait DELETE extends HttpMethod
  
  @js.native
  sealed trait GET extends HttpMethod
  
  @js.native
  sealed trait PATCH extends HttpMethod
  
  @js.native
  sealed trait POST extends HttpMethod
  
  @js.native
  sealed trait PUT extends HttpMethod
  
  @js.native
  sealed trait buffer extends BodyParser
  
  @js.native
  sealed trait debug extends LogLevel
  
  @js.native
  sealed trait error extends LogLevel
  
  @js.native
  sealed trait info extends LogLevel
  
  @js.native
  sealed trait json extends BodyParser
  
  @js.native
  sealed trait mirror extends ServeStrategy
  
  @js.native
  sealed trait overlay extends ServeStrategy
  
  @js.native
  sealed trait params extends BodyParser
  
  @js.native
  sealed trait replace extends ServeStrategy
  
  @js.native
  sealed trait request extends Phase
  
  @js.native
  sealed trait `request-sent` extends Phase
  
  @js.native
  sealed trait response extends Phase
  
  @js.native
  sealed trait `response-sent` extends Phase
  
  @js.native
  sealed trait string extends BodyParser
  
  @js.native
  sealed trait warn extends LogLevel
}
