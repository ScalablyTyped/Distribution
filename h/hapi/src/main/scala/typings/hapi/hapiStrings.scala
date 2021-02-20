package typings.hapi

import typings.hapi.mod.Lifecycle._FailAction
import typings.hapi.mod.PayloadOutput
import typings.hapi.mod.ReferrerPolicy
import typings.hapi.mod.RequestEventType
import typings.hapi.mod.RouteOptionsAccessEntity
import typings.hapi.mod.RouteRequestExtType
import typings.hapi.mod.ServerExtType
import typings.hapi.mod.ServerRequestExtType
import typings.hapi.mod.Util.HTTP_METHODS
import typings.hapi.mod.Util.HTTP_METHODS_PARTIAL
import typings.hapi.mod.Util.HTTP_METHODS_PARTIAL_LOWERCASE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hapiStrings {
  
  @js.native
  sealed trait default extends StObject
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait Asterisk extends StObject
  @scala.inline
  def Asterisk: Asterisk = "*".asInstanceOf[Asterisk]
  
  @js.native
  sealed trait DELETE
    extends HTTP_METHODS
       with HTTP_METHODS_PARTIAL
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @js.native
  sealed trait GET
    extends HTTP_METHODS
       with HTTP_METHODS_PARTIAL
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait HEAD extends HTTP_METHODS
  @scala.inline
  def HEAD: HEAD = "HEAD".asInstanceOf[HEAD]
  
  @js.native
  sealed trait Lax extends StObject
  @scala.inline
  def Lax: Lax = "Lax".asInstanceOf[Lax]
  
  @js.native
  sealed trait OPTIONS
    extends HTTP_METHODS
       with HTTP_METHODS_PARTIAL
  @scala.inline
  def OPTIONS: OPTIONS = "OPTIONS".asInstanceOf[OPTIONS]
  
  @js.native
  sealed trait PATCH
    extends HTTP_METHODS
       with HTTP_METHODS_PARTIAL
  @scala.inline
  def PATCH: PATCH = "PATCH".asInstanceOf[PATCH]
  
  @js.native
  sealed trait POST
    extends HTTP_METHODS
       with HTTP_METHODS_PARTIAL
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait PUT
    extends HTTP_METHODS
       with HTTP_METHODS_PARTIAL
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @js.native
  sealed trait Strict extends StObject
  @scala.inline
  def Strict: Strict = "Strict".asInstanceOf[Strict]
  
  @js.native
  sealed trait _empty extends ReferrerPolicy
  @scala.inline
  def _empty: _empty = "".asInstanceOf[_empty]
  
  @js.native
  sealed trait `allow-from` extends StObject
  @scala.inline
  def `allow-from`: `allow-from` = "allow-from".asInstanceOf[`allow-from`]
  
  @js.native
  sealed trait annotated extends StObject
  @scala.inline
  def annotated: annotated = "annotated".asInstanceOf[annotated]
  
  @js.native
  sealed trait any extends RouteOptionsAccessEntity
  @scala.inline
  def any: any = "any".asInstanceOf[any]
  
  @js.native
  sealed trait app extends RouteOptionsAccessEntity
  @scala.inline
  def app: app = "app".asInstanceOf[app]
  
  @js.native
  sealed trait ascii extends StObject
  @scala.inline
  def ascii: ascii = "ascii".asInstanceOf[ascii]
  
  @js.native
  sealed trait base64 extends StObject
  @scala.inline
  def base64: base64 = "base64".asInstanceOf[base64]
  
  @js.native
  sealed trait base64json extends StObject
  @scala.inline
  def base64json: base64json = "base64json".asInstanceOf[base64json]
  
  @js.native
  sealed trait binary extends StObject
  @scala.inline
  def binary: binary = "binary".asInstanceOf[binary]
  
  @js.native
  sealed trait buffer extends StObject
  @scala.inline
  def buffer: buffer = "buffer".asInstanceOf[buffer]
  
  @js.native
  sealed trait data extends PayloadOutput
  @scala.inline
  def data: data = "data".asInstanceOf[data]
  
  @js.native
  sealed trait delete_
    extends HTTP_METHODS
       with HTTP_METHODS_PARTIAL
       with HTTP_METHODS_PARTIAL_LOWERCASE
  @scala.inline
  def delete_ : delete_ = "delete".asInstanceOf[delete_]
  
  @js.native
  sealed trait deny extends StObject
  @scala.inline
  def deny: deny = "deny".asInstanceOf[deny]
  
  @js.native
  sealed trait disconnect extends RequestEventType
  @scala.inline
  def disconnect: disconnect = "disconnect".asInstanceOf[disconnect]
  
  @js.native
  sealed trait error extends _FailAction
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait file extends PayloadOutput
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait finish extends RequestEventType
  @scala.inline
  def finish: finish = "finish".asInstanceOf[finish]
  
  @js.native
  sealed trait form extends StObject
  @scala.inline
  def form: form = "form".asInstanceOf[form]
  
  @js.native
  sealed trait get_
    extends HTTP_METHODS
       with HTTP_METHODS_PARTIAL
       with HTTP_METHODS_PARTIAL_LOWERCASE
  @scala.inline
  def get_ : get_ = "get".asInstanceOf[get_]
  
  @js.native
  sealed trait gunzip extends StObject
  @scala.inline
  def gunzip: gunzip = "gunzip".asInstanceOf[gunzip]
  
  @js.native
  sealed trait handler extends StObject
  @scala.inline
  def handler: handler = "handler".asInstanceOf[handler]
  
  @js.native
  sealed trait head_ extends HTTP_METHODS
  @scala.inline
  def head_ : head_ = "head".asInstanceOf[head_]
  
  @js.native
  sealed trait hex extends StObject
  @scala.inline
  def hex: hex = "hex".asInstanceOf[hex]
  
  @js.native
  sealed trait http extends StObject
  @scala.inline
  def http: http = "http".asInstanceOf[http]
  
  @js.native
  sealed trait https extends StObject
  @scala.inline
  def https: https = "https".asInstanceOf[https]
  
  @js.native
  sealed trait ignore extends _FailAction
  @scala.inline
  def ignore: ignore = "ignore".asInstanceOf[ignore]
  
  @js.native
  sealed trait internal extends StObject
  @scala.inline
  def internal: internal = "internal".asInstanceOf[internal]
  
  @js.native
  sealed trait iron extends StObject
  @scala.inline
  def iron: iron = "iron".asInstanceOf[iron]
  
  @js.native
  sealed trait latin1 extends StObject
  @scala.inline
  def latin1: latin1 = "latin1".asInstanceOf[latin1]
  
  @js.native
  sealed trait log extends _FailAction
  @scala.inline
  def log: log = "log".asInstanceOf[log]
  
  @js.native
  sealed trait `no-referrer` extends ReferrerPolicy
  @scala.inline
  def `no-referrer`: `no-referrer` = "no-referrer".asInstanceOf[`no-referrer`]
  
  @js.native
  sealed trait `no-referrer-when-downgrade` extends ReferrerPolicy
  @scala.inline
  def `no-referrer-when-downgrade`: `no-referrer-when-downgrade` = "no-referrer-when-downgrade".asInstanceOf[`no-referrer-when-downgrade`]
  
  @js.native
  sealed trait none extends StObject
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait onCredentials
    extends RouteRequestExtType
       with ServerRequestExtType
  @scala.inline
  def onCredentials: onCredentials = "onCredentials".asInstanceOf[onCredentials]
  
  @js.native
  sealed trait onPostAuth
    extends RouteRequestExtType
       with ServerRequestExtType
  @scala.inline
  def onPostAuth: onPostAuth = "onPostAuth".asInstanceOf[onPostAuth]
  
  @js.native
  sealed trait onPostHandler
    extends RouteRequestExtType
       with ServerRequestExtType
  @scala.inline
  def onPostHandler: onPostHandler = "onPostHandler".asInstanceOf[onPostHandler]
  
  @js.native
  sealed trait onPostStart extends ServerExtType
  @scala.inline
  def onPostStart: onPostStart = "onPostStart".asInstanceOf[onPostStart]
  
  @js.native
  sealed trait onPostStop extends ServerExtType
  @scala.inline
  def onPostStop: onPostStop = "onPostStop".asInstanceOf[onPostStop]
  
  @js.native
  sealed trait onPreAuth
    extends RouteRequestExtType
       with ServerRequestExtType
  @scala.inline
  def onPreAuth: onPreAuth = "onPreAuth".asInstanceOf[onPreAuth]
  
  @js.native
  sealed trait onPreHandler
    extends RouteRequestExtType
       with ServerRequestExtType
  @scala.inline
  def onPreHandler: onPreHandler = "onPreHandler".asInstanceOf[onPreHandler]
  
  @js.native
  sealed trait onPreResponse
    extends RouteRequestExtType
       with ServerRequestExtType
  @scala.inline
  def onPreResponse: onPreResponse = "onPreResponse".asInstanceOf[onPreResponse]
  
  @js.native
  sealed trait onPreStart extends ServerExtType
  @scala.inline
  def onPreStart: onPreStart = "onPreStart".asInstanceOf[onPreStart]
  
  @js.native
  sealed trait onPreStop extends ServerExtType
  @scala.inline
  def onPreStop: onPreStop = "onPreStop".asInstanceOf[onPreStop]
  
  @js.native
  sealed trait onRequest extends ServerRequestExtType
  @scala.inline
  def onRequest: onRequest = "onRequest".asInstanceOf[onRequest]
  
  @js.native
  sealed trait optional extends StObject
  @scala.inline
  def optional: optional = "optional".asInstanceOf[optional]
  
  @js.native
  sealed trait options_
    extends HTTP_METHODS
       with HTTP_METHODS_PARTIAL
       with HTTP_METHODS_PARTIAL_LOWERCASE
  @scala.inline
  def options_ : options_ = "options".asInstanceOf[options_]
  
  @js.native
  sealed trait origin extends ReferrerPolicy
  @scala.inline
  def origin: origin = "origin".asInstanceOf[origin]
  
  @js.native
  sealed trait `origin-when-cross-origin` extends ReferrerPolicy
  @scala.inline
  def `origin-when-cross-origin`: `origin-when-cross-origin` = "origin-when-cross-origin".asInstanceOf[`origin-when-cross-origin`]
  
  @js.native
  sealed trait patch_
    extends HTTP_METHODS
       with HTTP_METHODS_PARTIAL
       with HTTP_METHODS_PARTIAL_LOWERCASE
  @scala.inline
  def patch_ : patch_ = "patch".asInstanceOf[patch_]
  
  @js.native
  sealed trait peek extends RequestEventType
  @scala.inline
  def peek: peek = "peek".asInstanceOf[peek]
  
  @js.native
  sealed trait plain extends StObject
  @scala.inline
  def plain: plain = "plain".asInstanceOf[plain]
  
  @js.native
  sealed trait plugin extends StObject
  @scala.inline
  def plugin: plugin = "plugin".asInstanceOf[plugin]
  
  @js.native
  sealed trait post_
    extends HTTP_METHODS
       with HTTP_METHODS_PARTIAL
       with HTTP_METHODS_PARTIAL_LOWERCASE
  @scala.inline
  def post_ : post_ = "post".asInstanceOf[post_]
  
  @js.native
  sealed trait `private` extends StObject
  @scala.inline
  def `private`: `private` = "private".asInstanceOf[`private`]
  
  @js.native
  sealed trait public extends StObject
  @scala.inline
  def public: public = "public".asInstanceOf[public]
  
  @js.native
  sealed trait put_
    extends HTTP_METHODS
       with HTTP_METHODS_PARTIAL
       with HTTP_METHODS_PARTIAL_LOWERCASE
  @scala.inline
  def put_ : put_ = "put".asInstanceOf[put_]
  
  @js.native
  sealed trait request extends StObject
  @scala.inline
  def request: request = "request".asInstanceOf[request]
  
  @js.native
  sealed trait required extends StObject
  @scala.inline
  def required: required = "required".asInstanceOf[required]
  
  @js.native
  sealed trait response extends StObject
  @scala.inline
  def response: response = "response".asInstanceOf[response]
  
  @js.native
  sealed trait route extends StObject
  @scala.inline
  def route: route = "route".asInstanceOf[route]
  
  @js.native
  sealed trait `same-origin` extends ReferrerPolicy
  @scala.inline
  def `same-origin`: `same-origin` = "same-origin".asInstanceOf[`same-origin`]
  
  @js.native
  sealed trait sameorigin extends StObject
  @scala.inline
  def sameorigin: sameorigin = "sameorigin".asInstanceOf[sameorigin]
  
  @js.native
  sealed trait server extends StObject
  @scala.inline
  def server: server = "server".asInstanceOf[server]
  
  @js.native
  sealed trait socket extends StObject
  @scala.inline
  def socket: socket = "socket".asInstanceOf[socket]
  
  @js.native
  sealed trait start extends StObject
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait stop extends StObject
  @scala.inline
  def stop: stop = "stop".asInstanceOf[stop]
  
  @js.native
  sealed trait stream extends PayloadOutput
  @scala.inline
  def stream: stream = "stream".asInstanceOf[stream]
  
  @js.native
  sealed trait `strict-origin` extends ReferrerPolicy
  @scala.inline
  def `strict-origin`: `strict-origin` = "strict-origin".asInstanceOf[`strict-origin`]
  
  @js.native
  sealed trait `strict-origin-when-cross-origin` extends ReferrerPolicy
  @scala.inline
  def `strict-origin-when-cross-origin`: `strict-origin-when-cross-origin` = "strict-origin-when-cross-origin".asInstanceOf[`strict-origin-when-cross-origin`]
  
  @js.native
  sealed trait tcp extends StObject
  @scala.inline
  def tcp: tcp = "tcp".asInstanceOf[tcp]
  
  @js.native
  sealed trait toolkit extends StObject
  @scala.inline
  def toolkit: toolkit = "toolkit".asInstanceOf[toolkit]
  
  @js.native
  sealed trait `try` extends StObject
  @scala.inline
  def `try`: `try` = "try".asInstanceOf[`try`]
  
  @js.native
  sealed trait ucs2 extends StObject
  @scala.inline
  def ucs2: ucs2 = "ucs2".asInstanceOf[ucs2]
  
  @js.native
  sealed trait `unsafe-url` extends ReferrerPolicy
  @scala.inline
  def `unsafe-url`: `unsafe-url` = "unsafe-url".asInstanceOf[`unsafe-url`]
  
  @js.native
  sealed trait user extends RouteOptionsAccessEntity
  @scala.inline
  def user: user = "user".asInstanceOf[user]
  
  @js.native
  sealed trait utf16le extends StObject
  @scala.inline
  def utf16le: utf16le = "utf16le".asInstanceOf[utf16le]
  
  @js.native
  sealed trait utf8 extends StObject
  @scala.inline
  def utf8: utf8 = "utf8".asInstanceOf[utf8]
}
