package typings.hoxy

import typings.hoxy.mod.BodyParser
import typings.hoxy.mod.HttpMethod
import typings.hoxy.mod.LogLevel
import typings.hoxy.mod.Phase
import typings.hoxy.mod.ServeStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hoxyStrings {
  
  @js.native
  sealed trait $
    extends StObject
       with BodyParser
  @scala.inline
  def $: $ = "$".asInstanceOf[$]
  
  @js.native
  sealed trait DELETE
    extends StObject
       with HttpMethod
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @js.native
  sealed trait GET
    extends StObject
       with HttpMethod
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait PATCH
    extends StObject
       with HttpMethod
  @scala.inline
  def PATCH: PATCH = "PATCH".asInstanceOf[PATCH]
  
  @js.native
  sealed trait POST
    extends StObject
       with HttpMethod
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait PUT
    extends StObject
       with HttpMethod
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @js.native
  sealed trait buffer
    extends StObject
       with BodyParser
  @scala.inline
  def buffer: buffer = "buffer".asInstanceOf[buffer]
  
  @js.native
  sealed trait debug
    extends StObject
       with LogLevel
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait error
    extends StObject
       with LogLevel
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait info
    extends StObject
       with LogLevel
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait json
    extends StObject
       with BodyParser
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  
  @js.native
  sealed trait mirror
    extends StObject
       with ServeStrategy
  @scala.inline
  def mirror: mirror = "mirror".asInstanceOf[mirror]
  
  @js.native
  sealed trait overlay
    extends StObject
       with ServeStrategy
  @scala.inline
  def overlay: overlay = "overlay".asInstanceOf[overlay]
  
  @js.native
  sealed trait params
    extends StObject
       with BodyParser
  @scala.inline
  def params: params = "params".asInstanceOf[params]
  
  @js.native
  sealed trait replace
    extends StObject
       with ServeStrategy
  @scala.inline
  def replace: replace = "replace".asInstanceOf[replace]
  
  @js.native
  sealed trait request
    extends StObject
       with Phase
  @scala.inline
  def request: request = "request".asInstanceOf[request]
  
  @js.native
  sealed trait `request-sent`
    extends StObject
       with Phase
  @scala.inline
  def `request-sent`: `request-sent` = "request-sent".asInstanceOf[`request-sent`]
  
  @js.native
  sealed trait response
    extends StObject
       with Phase
  @scala.inline
  def response: response = "response".asInstanceOf[response]
  
  @js.native
  sealed trait `response-sent`
    extends StObject
       with Phase
  @scala.inline
  def `response-sent`: `response-sent` = "response-sent".asInstanceOf[`response-sent`]
  
  @js.native
  sealed trait string
    extends StObject
       with BodyParser
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait warn
    extends StObject
       with LogLevel
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}
