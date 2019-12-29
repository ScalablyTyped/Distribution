package typings.hapi

import typings.hapi.hapiMod.Lifecycle._FailAction
import typings.hapi.hapiMod.PayloadOutput
import typings.hapi.hapiMod.ReferrerPolicy
import typings.hapi.hapiMod.RequestEventType
import typings.hapi.hapiMod.RouteOptionsAccessEntity
import typings.hapi.hapiMod.RouteRequestExtType
import typings.hapi.hapiMod.ServerExtType
import typings.hapi.hapiMod.ServerRequestExtType
import typings.hapi.hapiMod.Util.HTTP_METHODS
import typings.hapi.hapiMod.Util.HTTP_METHODS_PARTIAL
import typings.hapi.hapiMod.Util.HTTP_METHODS_PARTIAL_LOWERCASE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object hapiStrings {
  @js.native
  sealed trait Asterisk extends js.Object
  
  @js.native
  sealed trait DELETE
    extends HTTP_METHODS
       with HTTP_METHODS_PARTIAL
  
  @js.native
  sealed trait GET
    extends HTTP_METHODS
       with HTTP_METHODS_PARTIAL
  
  @js.native
  sealed trait HEAD extends HTTP_METHODS
  
  @js.native
  sealed trait Lax extends js.Object
  
  @js.native
  sealed trait OPTIONS
    extends HTTP_METHODS
       with HTTP_METHODS_PARTIAL
  
  @js.native
  sealed trait PATCH
    extends HTTP_METHODS
       with HTTP_METHODS_PARTIAL
  
  @js.native
  sealed trait POST
    extends HTTP_METHODS
       with HTTP_METHODS_PARTIAL
  
  @js.native
  sealed trait PUT
    extends HTTP_METHODS
       with HTTP_METHODS_PARTIAL
  
  @js.native
  sealed trait RouteOptions extends js.Object
  
  @js.native
  sealed trait Strict extends js.Object
  
  @js.native
  sealed trait _empty extends ReferrerPolicy
  
  @js.native
  sealed trait `allow-from` extends js.Object
  
  @js.native
  sealed trait annotated extends js.Object
  
  @js.native
  sealed trait any extends RouteOptionsAccessEntity
  
  @js.native
  sealed trait app extends RouteOptionsAccessEntity
  
  @js.native
  sealed trait ascii extends js.Object
  
  @js.native
  sealed trait base64 extends js.Object
  
  @js.native
  sealed trait base64json extends js.Object
  
  @js.native
  sealed trait binary extends js.Object
  
  @js.native
  sealed trait buffer extends js.Object
  
  @js.native
  sealed trait data extends PayloadOutput
  
  @js.native
  sealed trait default extends js.Object
  
  @js.native
  sealed trait delete_
    extends HTTP_METHODS
       with HTTP_METHODS_PARTIAL
       with HTTP_METHODS_PARTIAL_LOWERCASE
  
  @js.native
  sealed trait deny extends js.Object
  
  @js.native
  sealed trait disconnect extends RequestEventType
  
  @js.native
  sealed trait error extends _FailAction
  
  @js.native
  sealed trait file extends PayloadOutput
  
  @js.native
  sealed trait finish extends RequestEventType
  
  @js.native
  sealed trait form extends js.Object
  
  @js.native
  sealed trait get_
    extends HTTP_METHODS
       with HTTP_METHODS_PARTIAL
       with HTTP_METHODS_PARTIAL_LOWERCASE
  
  @js.native
  sealed trait gunzip extends js.Object
  
  @js.native
  sealed trait handler extends js.Object
  
  @js.native
  sealed trait head_ extends HTTP_METHODS
  
  @js.native
  sealed trait hex extends js.Object
  
  @js.native
  sealed trait http extends js.Object
  
  @js.native
  sealed trait https extends js.Object
  
  @js.native
  sealed trait ignore extends _FailAction
  
  @js.native
  sealed trait internal extends js.Object
  
  @js.native
  sealed trait iron extends js.Object
  
  @js.native
  sealed trait latin1 extends js.Object
  
  @js.native
  sealed trait log extends _FailAction
  
  @js.native
  sealed trait `no-referrer` extends ReferrerPolicy
  
  @js.native
  sealed trait `no-referrer-when-downgrade` extends ReferrerPolicy
  
  @js.native
  sealed trait none extends js.Object
  
  @js.native
  sealed trait onCredentials
    extends RouteRequestExtType
       with ServerRequestExtType
  
  @js.native
  sealed trait onPostAuth
    extends RouteRequestExtType
       with ServerRequestExtType
  
  @js.native
  sealed trait onPostHandler
    extends RouteRequestExtType
       with ServerRequestExtType
  
  @js.native
  sealed trait onPostStart extends ServerExtType
  
  @js.native
  sealed trait onPostStop extends ServerExtType
  
  @js.native
  sealed trait onPreAuth
    extends RouteRequestExtType
       with ServerRequestExtType
  
  @js.native
  sealed trait onPreHandler
    extends RouteRequestExtType
       with ServerRequestExtType
  
  @js.native
  sealed trait onPreResponse
    extends RouteRequestExtType
       with ServerRequestExtType
  
  @js.native
  sealed trait onPreStart extends ServerExtType
  
  @js.native
  sealed trait onPreStop extends ServerExtType
  
  @js.native
  sealed trait onRequest extends ServerRequestExtType
  
  @js.native
  sealed trait optional extends js.Object
  
  @js.native
  sealed trait options_
    extends HTTP_METHODS
       with HTTP_METHODS_PARTIAL
       with HTTP_METHODS_PARTIAL_LOWERCASE
  
  @js.native
  sealed trait origin extends ReferrerPolicy
  
  @js.native
  sealed trait `origin-when-cross-origin` extends ReferrerPolicy
  
  @js.native
  sealed trait patch_
    extends HTTP_METHODS
       with HTTP_METHODS_PARTIAL
       with HTTP_METHODS_PARTIAL_LOWERCASE
  
  @js.native
  sealed trait peek extends RequestEventType
  
  @js.native
  sealed trait plain extends js.Object
  
  @js.native
  sealed trait plugin extends js.Object
  
  @js.native
  sealed trait post_
    extends HTTP_METHODS
       with HTTP_METHODS_PARTIAL
       with HTTP_METHODS_PARTIAL_LOWERCASE
  
  @js.native
  sealed trait `private` extends js.Object
  
  @js.native
  sealed trait public extends js.Object
  
  @js.native
  sealed trait put_
    extends HTTP_METHODS
       with HTTP_METHODS_PARTIAL
       with HTTP_METHODS_PARTIAL_LOWERCASE
  
  @js.native
  sealed trait request extends js.Object
  
  @js.native
  sealed trait required extends js.Object
  
  @js.native
  sealed trait response extends js.Object
  
  @js.native
  sealed trait route extends js.Object
  
  @js.native
  sealed trait `same-origin` extends ReferrerPolicy
  
  @js.native
  sealed trait sameorigin extends js.Object
  
  @js.native
  sealed trait server extends js.Object
  
  @js.native
  sealed trait socket extends js.Object
  
  @js.native
  sealed trait start extends js.Object
  
  @js.native
  sealed trait stop extends js.Object
  
  @js.native
  sealed trait stream extends PayloadOutput
  
  @js.native
  sealed trait `strict-origin` extends ReferrerPolicy
  
  @js.native
  sealed trait `strict-origin-when-cross-origin` extends ReferrerPolicy
  
  @js.native
  sealed trait tcp extends js.Object
  
  @js.native
  sealed trait toolkit extends js.Object
  
  @js.native
  sealed trait `try` extends js.Object
  
  @js.native
  sealed trait ucs2 extends js.Object
  
  @js.native
  sealed trait `unsafe-url` extends ReferrerPolicy
  
  @js.native
  sealed trait user extends RouteOptionsAccessEntity
  
  @js.native
  sealed trait utf16le extends js.Object
  
  @js.native
  sealed trait utf8 extends js.Object
  
  @scala.inline
  def Asterisk: Asterisk = "*".asInstanceOf[Asterisk]
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  @scala.inline
  def HEAD: HEAD = "HEAD".asInstanceOf[HEAD]
  @scala.inline
  def Lax: Lax = "Lax".asInstanceOf[Lax]
  @scala.inline
  def OPTIONS: OPTIONS = "OPTIONS".asInstanceOf[OPTIONS]
  @scala.inline
  def PATCH: PATCH = "PATCH".asInstanceOf[PATCH]
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
  @scala.inline
  def RouteOptions: RouteOptions = "RouteOptions".asInstanceOf[RouteOptions]
  @scala.inline
  def Strict: Strict = "Strict".asInstanceOf[Strict]
  @scala.inline
  def _empty: _empty = "".asInstanceOf[_empty]
  @scala.inline
  def `allow-from`: `allow-from` = "allow-from".asInstanceOf[`allow-from`]
  @scala.inline
  def annotated: annotated = "annotated".asInstanceOf[annotated]
  @scala.inline
  def any: any = "any".asInstanceOf[any]
  @scala.inline
  def app: app = "app".asInstanceOf[app]
  @scala.inline
  def ascii: ascii = "ascii".asInstanceOf[ascii]
  @scala.inline
  def base64: base64 = "base64".asInstanceOf[base64]
  @scala.inline
  def base64json: base64json = "base64json".asInstanceOf[base64json]
  @scala.inline
  def binary: binary = "binary".asInstanceOf[binary]
  @scala.inline
  def buffer: buffer = "buffer".asInstanceOf[buffer]
  @scala.inline
  def data: data = "data".asInstanceOf[data]
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  @scala.inline
  def delete_ : delete_ = "delete".asInstanceOf[delete_]
  @scala.inline
  def deny: deny = "deny".asInstanceOf[deny]
  @scala.inline
  def disconnect: disconnect = "disconnect".asInstanceOf[disconnect]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  @scala.inline
  def finish: finish = "finish".asInstanceOf[finish]
  @scala.inline
  def form: form = "form".asInstanceOf[form]
  @scala.inline
  def get_ : get_ = "get".asInstanceOf[get_]
  @scala.inline
  def gunzip: gunzip = "gunzip".asInstanceOf[gunzip]
  @scala.inline
  def handler: handler = "handler".asInstanceOf[handler]
  @scala.inline
  def head_ : head_ = "head".asInstanceOf[head_]
  @scala.inline
  def hex: hex = "hex".asInstanceOf[hex]
  @scala.inline
  def http: http = "http".asInstanceOf[http]
  @scala.inline
  def https: https = "https".asInstanceOf[https]
  @scala.inline
  def ignore: ignore = "ignore".asInstanceOf[ignore]
  @scala.inline
  def internal: internal = "internal".asInstanceOf[internal]
  @scala.inline
  def iron: iron = "iron".asInstanceOf[iron]
  @scala.inline
  def latin1: latin1 = "latin1".asInstanceOf[latin1]
  @scala.inline
  def log: log = "log".asInstanceOf[log]
  @scala.inline
  def `no-referrer`: `no-referrer` = "no-referrer".asInstanceOf[`no-referrer`]
  @scala.inline
  def `no-referrer-when-downgrade`: `no-referrer-when-downgrade` = "no-referrer-when-downgrade".asInstanceOf[`no-referrer-when-downgrade`]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def onCredentials: onCredentials = "onCredentials".asInstanceOf[onCredentials]
  @scala.inline
  def onPostAuth: onPostAuth = "onPostAuth".asInstanceOf[onPostAuth]
  @scala.inline
  def onPostHandler: onPostHandler = "onPostHandler".asInstanceOf[onPostHandler]
  @scala.inline
  def onPostStart: onPostStart = "onPostStart".asInstanceOf[onPostStart]
  @scala.inline
  def onPostStop: onPostStop = "onPostStop".asInstanceOf[onPostStop]
  @scala.inline
  def onPreAuth: onPreAuth = "onPreAuth".asInstanceOf[onPreAuth]
  @scala.inline
  def onPreHandler: onPreHandler = "onPreHandler".asInstanceOf[onPreHandler]
  @scala.inline
  def onPreResponse: onPreResponse = "onPreResponse".asInstanceOf[onPreResponse]
  @scala.inline
  def onPreStart: onPreStart = "onPreStart".asInstanceOf[onPreStart]
  @scala.inline
  def onPreStop: onPreStop = "onPreStop".asInstanceOf[onPreStop]
  @scala.inline
  def onRequest: onRequest = "onRequest".asInstanceOf[onRequest]
  @scala.inline
  def optional: optional = "optional".asInstanceOf[optional]
  @scala.inline
  def options_ : options_ = "options".asInstanceOf[options_]
  @scala.inline
  def origin: origin = "origin".asInstanceOf[origin]
  @scala.inline
  def `origin-when-cross-origin`: `origin-when-cross-origin` = "origin-when-cross-origin".asInstanceOf[`origin-when-cross-origin`]
  @scala.inline
  def patch_ : patch_ = "patch".asInstanceOf[patch_]
  @scala.inline
  def peek: peek = "peek".asInstanceOf[peek]
  @scala.inline
  def plain: plain = "plain".asInstanceOf[plain]
  @scala.inline
  def plugin: plugin = "plugin".asInstanceOf[plugin]
  @scala.inline
  def post_ : post_ = "post".asInstanceOf[post_]
  @scala.inline
  def `private`: `private` = "private".asInstanceOf[`private`]
  @scala.inline
  def public: public = "public".asInstanceOf[public]
  @scala.inline
  def put_ : put_ = "put".asInstanceOf[put_]
  @scala.inline
  def request: request = "request".asInstanceOf[request]
  @scala.inline
  def required: required = "required".asInstanceOf[required]
  @scala.inline
  def response: response = "response".asInstanceOf[response]
  @scala.inline
  def route: route = "route".asInstanceOf[route]
  @scala.inline
  def `same-origin`: `same-origin` = "same-origin".asInstanceOf[`same-origin`]
  @scala.inline
  def sameorigin: sameorigin = "sameorigin".asInstanceOf[sameorigin]
  @scala.inline
  def server: server = "server".asInstanceOf[server]
  @scala.inline
  def socket: socket = "socket".asInstanceOf[socket]
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  @scala.inline
  def stop: stop = "stop".asInstanceOf[stop]
  @scala.inline
  def stream: stream = "stream".asInstanceOf[stream]
  @scala.inline
  def `strict-origin`: `strict-origin` = "strict-origin".asInstanceOf[`strict-origin`]
  @scala.inline
  def `strict-origin-when-cross-origin`: `strict-origin-when-cross-origin` = "strict-origin-when-cross-origin".asInstanceOf[`strict-origin-when-cross-origin`]
  @scala.inline
  def tcp: tcp = "tcp".asInstanceOf[tcp]
  @scala.inline
  def toolkit: toolkit = "toolkit".asInstanceOf[toolkit]
  @scala.inline
  def `try`: `try` = "try".asInstanceOf[`try`]
  @scala.inline
  def ucs2: ucs2 = "ucs2".asInstanceOf[ucs2]
  @scala.inline
  def `unsafe-url`: `unsafe-url` = "unsafe-url".asInstanceOf[`unsafe-url`]
  @scala.inline
  def user: user = "user".asInstanceOf[user]
  @scala.inline
  def utf16le: utf16le = "utf16le".asInstanceOf[utf16le]
  @scala.inline
  def utf8: utf8 = "utf8".asInstanceOf[utf8]
}

