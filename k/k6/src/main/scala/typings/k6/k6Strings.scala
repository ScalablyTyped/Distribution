package typings.k6

import typings.k6.cryptoMod.Algorithm
import typings.k6.cryptoMod.StringEncoding
import typings.k6.encodingMod.Base64Variant
import typings.k6.experimentalBrowserMod.ElementState
import typings.k6.experimentalBrowserMod.ImageFormat
import typings.k6.experimentalBrowserMod.InputElementState
import typings.k6.experimentalBrowserMod.KeyboardModifier
import typings.k6.experimentalBrowserMod.LifecycleEvent
import typings.k6.experimentalBrowserMod.MouseButton
import typings.k6.experimentalBrowserMod.PollingMethod
import typings.k6.experimentalBrowserMod.ResourceType
import typings.k6.experimentalWebcryptoMod.HashAlgorithmIdentifier
import typings.k6.httpMod.AuthMethod
import typings.k6.httpMod.CipherSuite
import typings.k6.httpMod.Protocol
import typings.k6.httpMod.ResponseType
import typings.k6.optionsMod.ExecutorOptions
import typings.k6.wsMod.EventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object k6Strings {
  
  @js.native
  sealed trait `AES-CBC` extends StObject
  inline def `AES-CBC`: `AES-CBC` = "AES-CBC".asInstanceOf[`AES-CBC`]
  
  @js.native
  sealed trait `AES-CFB` extends StObject
  inline def `AES-CFB`: `AES-CFB` = "AES-CFB".asInstanceOf[`AES-CFB`]
  
  @js.native
  sealed trait `AES-CTR` extends StObject
  inline def `AES-CTR`: `AES-CTR` = "AES-CTR".asInstanceOf[`AES-CTR`]
  
  @js.native
  sealed trait `AES-GCM` extends StObject
  inline def `AES-GCM`: `AES-GCM` = "AES-GCM".asInstanceOf[`AES-GCM`]
  
  @js.native
  sealed trait `AES-KW` extends StObject
  inline def `AES-KW`: `AES-KW` = "AES-KW".asInstanceOf[`AES-KW`]
  
  @js.native
  sealed trait Alt
    extends StObject
       with KeyboardModifier
  inline def Alt: Alt = "Alt".asInstanceOf[Alt]
  
  @js.native
  sealed trait Control
    extends StObject
       with KeyboardModifier
  inline def Control: Control = "Control".asInstanceOf[Control]
  
  @js.native
  sealed trait HMAC extends StObject
  inline def HMAC: HMAC = "HMAC".asInstanceOf[HMAC]
  
  @js.native
  sealed trait HTTPSlash1Dot0
    extends StObject
       with Protocol
  inline def HTTPSlash1Dot0: HTTPSlash1Dot0 = "HTTP/1.0".asInstanceOf[HTTPSlash1Dot0]
  
  @js.native
  sealed trait HTTPSlash1Dot1
    extends StObject
       with Protocol
  inline def HTTPSlash1Dot1: HTTPSlash1Dot1 = "HTTP/1.1".asInstanceOf[HTTPSlash1Dot1]
  
  @js.native
  sealed trait HTTPSlash2Dot0
    extends StObject
       with Protocol
  inline def HTTPSlash2Dot0: HTTPSlash2Dot0 = "HTTP/2.0".asInstanceOf[HTTPSlash2Dot0]
  
  @js.native
  sealed trait Meta
    extends StObject
       with KeyboardModifier
  inline def Meta: Meta = "Meta".asInstanceOf[Meta]
  
  @js.native
  sealed trait `SHA-1`
    extends StObject
       with HashAlgorithmIdentifier
  inline def `SHA-1`: `SHA-1` = "SHA-1".asInstanceOf[`SHA-1`]
  
  @js.native
  sealed trait `SHA-256`
    extends StObject
       with HashAlgorithmIdentifier
  inline def `SHA-256`: `SHA-256` = "SHA-256".asInstanceOf[`SHA-256`]
  
  @js.native
  sealed trait `SHA-384`
    extends StObject
       with HashAlgorithmIdentifier
  inline def `SHA-384`: `SHA-384` = "SHA-384".asInstanceOf[`SHA-384`]
  
  @js.native
  sealed trait `SHA-512`
    extends StObject
       with HashAlgorithmIdentifier
  inline def `SHA-512`: `SHA-512` = "SHA-512".asInstanceOf[`SHA-512`]
  
  @js.native
  sealed trait Shift
    extends StObject
       with KeyboardModifier
  inline def Shift: Shift = "Shift".asInstanceOf[Shift]
  
  @js.native
  sealed trait TLS_AES_128_GCM_SHA256
    extends StObject
       with CipherSuite
  inline def TLS_AES_128_GCM_SHA256: TLS_AES_128_GCM_SHA256 = "TLS_AES_128_GCM_SHA256".asInstanceOf[TLS_AES_128_GCM_SHA256]
  
  @js.native
  sealed trait TLS_AES_256_GCM_SHA384
    extends StObject
       with CipherSuite
  inline def TLS_AES_256_GCM_SHA384: TLS_AES_256_GCM_SHA384 = "TLS_AES_256_GCM_SHA384".asInstanceOf[TLS_AES_256_GCM_SHA384]
  
  @js.native
  sealed trait TLS_CHACHA20_POLY1305_SHA256
    extends StObject
       with CipherSuite
  inline def TLS_CHACHA20_POLY1305_SHA256: TLS_CHACHA20_POLY1305_SHA256 = "TLS_CHACHA20_POLY1305_SHA256".asInstanceOf[TLS_CHACHA20_POLY1305_SHA256]
  
  @js.native
  sealed trait TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA
    extends StObject
       with CipherSuite
  inline def TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA: TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA = "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA".asInstanceOf[TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA]
  
  @js.native
  sealed trait TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256
    extends StObject
       with CipherSuite
  inline def TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256: TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256 = "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256".asInstanceOf[TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256]
  
  @js.native
  sealed trait TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256
    extends StObject
       with CipherSuite
  inline def TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256: TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 = "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256".asInstanceOf[TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256]
  
  @js.native
  sealed trait TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA
    extends StObject
       with CipherSuite
  inline def TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA: TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA = "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA".asInstanceOf[TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA]
  
  @js.native
  sealed trait TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384
    extends StObject
       with CipherSuite
  inline def TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384: TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 = "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384".asInstanceOf[TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384]
  
  @js.native
  sealed trait TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305
    extends StObject
       with CipherSuite
  inline def TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305: TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305 = "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305".asInstanceOf[TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305]
  
  @js.native
  sealed trait TLS_ECDHE_ECDSA_WITH_RC4_128_SHA
    extends StObject
       with CipherSuite
  inline def TLS_ECDHE_ECDSA_WITH_RC4_128_SHA: TLS_ECDHE_ECDSA_WITH_RC4_128_SHA = "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA".asInstanceOf[TLS_ECDHE_ECDSA_WITH_RC4_128_SHA]
  
  @js.native
  sealed trait TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA
    extends StObject
       with CipherSuite
  inline def TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA: TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA = "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA".asInstanceOf[TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA]
  
  @js.native
  sealed trait TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA
    extends StObject
       with CipherSuite
  inline def TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA: TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA = "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA".asInstanceOf[TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA]
  
  @js.native
  sealed trait TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256
    extends StObject
       with CipherSuite
  inline def TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256: TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 = "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256".asInstanceOf[TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256]
  
  @js.native
  sealed trait TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256
    extends StObject
       with CipherSuite
  inline def TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256: TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 = "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256".asInstanceOf[TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256]
  
  @js.native
  sealed trait TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA
    extends StObject
       with CipherSuite
  inline def TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA: TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA = "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA".asInstanceOf[TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA]
  
  @js.native
  sealed trait TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384
    extends StObject
       with CipherSuite
  inline def TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384: TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 = "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384".asInstanceOf[TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384]
  
  @js.native
  sealed trait TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305
    extends StObject
       with CipherSuite
  inline def TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305: TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305 = "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305".asInstanceOf[TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305]
  
  @js.native
  sealed trait TLS_ECDHE_RSA_WITH_RC4_128_SHA
    extends StObject
       with CipherSuite
  inline def TLS_ECDHE_RSA_WITH_RC4_128_SHA: TLS_ECDHE_RSA_WITH_RC4_128_SHA = "TLS_ECDHE_RSA_WITH_RC4_128_SHA".asInstanceOf[TLS_ECDHE_RSA_WITH_RC4_128_SHA]
  
  @js.native
  sealed trait TLS_RSA_WITH_3DES_EDE_CBC_SHA
    extends StObject
       with CipherSuite
  inline def TLS_RSA_WITH_3DES_EDE_CBC_SHA: TLS_RSA_WITH_3DES_EDE_CBC_SHA = "TLS_RSA_WITH_3DES_EDE_CBC_SHA".asInstanceOf[TLS_RSA_WITH_3DES_EDE_CBC_SHA]
  
  @js.native
  sealed trait TLS_RSA_WITH_AES_128_CBC_SHA
    extends StObject
       with CipherSuite
  inline def TLS_RSA_WITH_AES_128_CBC_SHA: TLS_RSA_WITH_AES_128_CBC_SHA = "TLS_RSA_WITH_AES_128_CBC_SHA".asInstanceOf[TLS_RSA_WITH_AES_128_CBC_SHA]
  
  @js.native
  sealed trait TLS_RSA_WITH_AES_128_CBC_SHA256
    extends StObject
       with CipherSuite
  inline def TLS_RSA_WITH_AES_128_CBC_SHA256: TLS_RSA_WITH_AES_128_CBC_SHA256 = "TLS_RSA_WITH_AES_128_CBC_SHA256".asInstanceOf[TLS_RSA_WITH_AES_128_CBC_SHA256]
  
  @js.native
  sealed trait TLS_RSA_WITH_AES_128_GCM_SHA256
    extends StObject
       with CipherSuite
  inline def TLS_RSA_WITH_AES_128_GCM_SHA256: TLS_RSA_WITH_AES_128_GCM_SHA256 = "TLS_RSA_WITH_AES_128_GCM_SHA256".asInstanceOf[TLS_RSA_WITH_AES_128_GCM_SHA256]
  
  @js.native
  sealed trait TLS_RSA_WITH_AES_256_CBC_SHA
    extends StObject
       with CipherSuite
  inline def TLS_RSA_WITH_AES_256_CBC_SHA: TLS_RSA_WITH_AES_256_CBC_SHA = "TLS_RSA_WITH_AES_256_CBC_SHA".asInstanceOf[TLS_RSA_WITH_AES_256_CBC_SHA]
  
  @js.native
  sealed trait TLS_RSA_WITH_AES_256_GCM_SHA384
    extends StObject
       with CipherSuite
  inline def TLS_RSA_WITH_AES_256_GCM_SHA384: TLS_RSA_WITH_AES_256_GCM_SHA384 = "TLS_RSA_WITH_AES_256_GCM_SHA384".asInstanceOf[TLS_RSA_WITH_AES_256_GCM_SHA384]
  
  @js.native
  sealed trait TLS_RSA_WITH_RC4_128_SHA
    extends StObject
       with CipherSuite
  inline def TLS_RSA_WITH_RC4_128_SHA: TLS_RSA_WITH_RC4_128_SHA = "TLS_RSA_WITH_RC4_128_SHA".asInstanceOf[TLS_RSA_WITH_RC4_128_SHA]
  
  @js.native
  sealed trait achromatopsia extends StObject
  inline def achromatopsia: achromatopsia = "achromatopsia".asInstanceOf[achromatopsia]
  
  @js.native
  sealed trait any extends StObject
  inline def any: any = "any".asInstanceOf[any]
  
  @js.native
  sealed trait attached
    extends StObject
       with ElementState
       with InputElementState
  inline def attached: attached = "attached".asInstanceOf[attached]
  
  @js.native
  sealed trait b extends StObject
  inline def b: b = "b".asInstanceOf[b]
  
  @js.native
  sealed trait base64
    extends StObject
       with StringEncoding
  inline def base64: base64 = "base64".asInstanceOf[base64]
  
  @js.native
  sealed trait base64rawurl
    extends StObject
       with StringEncoding
  inline def base64rawurl: base64rawurl = "base64rawurl".asInstanceOf[base64rawurl]
  
  @js.native
  sealed trait base64url
    extends StObject
       with StringEncoding
  inline def base64url: base64url = "base64url".asInstanceOf[base64url]
  
  @js.native
  sealed trait basic
    extends StObject
       with AuthMethod
  inline def basic: basic = "basic".asInstanceOf[basic]
  
  @js.native
  sealed trait binary
    extends StObject
       with ResponseType
  inline def binary: binary = "binary".asInstanceOf[binary]
  
  @js.native
  sealed trait binaryMessage
    extends StObject
       with EventType
  inline def binaryMessage: binaryMessage = "binaryMessage".asInstanceOf[binaryMessage]
  
  @js.native
  sealed trait blurredVision extends StObject
  inline def blurredVision: blurredVision = "blurredVision".asInstanceOf[blurredVision]
  
  @js.native
  sealed trait close
    extends StObject
       with EventType
  inline def close: close = "close".asInstanceOf[close]
  
  @js.native
  sealed trait `constant-arrival-rate`
    extends StObject
       with ExecutorOptions
  inline def `constant-arrival-rate`: `constant-arrival-rate` = "constant-arrival-rate".asInstanceOf[`constant-arrival-rate`]
  
  @js.native
  sealed trait `constant-vus`
    extends StObject
       with ExecutorOptions
  inline def `constant-vus`: `constant-vus` = "constant-vus".asInstanceOf[`constant-vus`]
  
  @js.native
  sealed trait dark extends StObject
  inline def dark: dark = "dark".asInstanceOf[dark]
  
  @js.native
  sealed trait decrypt extends StObject
  inline def decrypt: decrypt = "decrypt".asInstanceOf[decrypt]
  
  @js.native
  sealed trait detached
    extends StObject
       with ElementState
       with InputElementState
  inline def detached: detached = "detached".asInstanceOf[detached]
  
  @js.native
  sealed trait deuteranopia extends StObject
  inline def deuteranopia: deuteranopia = "deuteranopia".asInstanceOf[deuteranopia]
  
  @js.native
  sealed trait digest
    extends StObject
       with AuthMethod
  inline def digest: digest = "digest".asInstanceOf[digest]
  
  @js.native
  sealed trait disabled
    extends StObject
       with InputElementState
  inline def disabled: disabled = "disabled".asInstanceOf[disabled]
  
  @js.native
  sealed trait document
    extends StObject
       with ResourceType
  inline def document: document = "document".asInstanceOf[document]
  
  @js.native
  sealed trait domcontentloaded
    extends StObject
       with LifecycleEvent
  inline def domcontentloaded: domcontentloaded = "domcontentloaded".asInstanceOf[domcontentloaded]
  
  @js.native
  sealed trait editable
    extends StObject
       with InputElementState
  inline def editable: editable = "editable".asInstanceOf[editable]
  
  @js.native
  sealed trait enabled
    extends StObject
       with InputElementState
  inline def enabled: enabled = "enabled".asInstanceOf[enabled]
  
  @js.native
  sealed trait encrypt extends StObject
  inline def encrypt: encrypt = "encrypt".asInstanceOf[encrypt]
  
  @js.native
  sealed trait error
    extends StObject
       with EventType
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait eventsource
    extends StObject
       with ResourceType
  inline def eventsource: eventsource = "eventsource".asInstanceOf[eventsource]
  
  @js.native
  sealed trait `externally-controlled`
    extends StObject
       with ExecutorOptions
  inline def `externally-controlled`: `externally-controlled` = "externally-controlled".asInstanceOf[`externally-controlled`]
  
  @js.native
  sealed trait fetch
    extends StObject
       with ResourceType
  inline def fetch: fetch = "fetch".asInstanceOf[fetch]
  
  @js.native
  sealed trait first extends StObject
  inline def first: first = "first".asInstanceOf[first]
  
  @js.native
  sealed trait font
    extends StObject
       with ResourceType
  inline def font: font = "font".asInstanceOf[font]
  
  @js.native
  sealed trait hex
    extends StObject
       with StringEncoding
  inline def hex: hex = "hex".asInstanceOf[hex]
  
  @js.native
  sealed trait hidden
    extends StObject
       with ElementState
       with InputElementState
  inline def hidden: hidden = "hidden".asInstanceOf[hidden]
  
  @js.native
  sealed trait `http-url` extends StObject
  inline def `http-url`: `http-url` = "http-url".asInstanceOf[`http-url`]
  
  @js.native
  sealed trait image
    extends StObject
       with ResourceType
  inline def image: image = "image".asInstanceOf[image]
  
  @js.native
  sealed trait interval
    extends StObject
       with PollingMethod
  inline def interval: interval = "interval".asInstanceOf[interval]
  
  @js.native
  sealed trait jaeger extends StObject
  inline def jaeger: jaeger = "jaeger".asInstanceOf[jaeger]
  
  @js.native
  sealed trait jpeg
    extends StObject
       with ImageFormat
  inline def jpeg: jpeg = "jpeg".asInstanceOf[jpeg]
  
  @js.native
  sealed trait left
    extends StObject
       with MouseButton
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait light extends StObject
  inline def light: light = "light".asInstanceOf[light]
  
  @js.native
  sealed trait load
    extends StObject
       with LifecycleEvent
  inline def load: load = "load".asInstanceOf[load]
  
  @js.native
  sealed trait manifest
    extends StObject
       with ResourceType
  inline def manifest: manifest = "manifest".asInstanceOf[manifest]
  
  @js.native
  sealed trait md4
    extends StObject
       with Algorithm
  inline def md4: md4 = "md4".asInstanceOf[md4]
  
  @js.native
  sealed trait md5
    extends StObject
       with Algorithm
  inline def md5: md5 = "md5".asInstanceOf[md5]
  
  @js.native
  sealed trait media
    extends StObject
       with ResourceType
  inline def media: media = "media".asInstanceOf[media]
  
  @js.native
  sealed trait message
    extends StObject
       with EventType
  inline def message: message = "message".asInstanceOf[message]
  
  @js.native
  sealed trait middle
    extends StObject
       with MouseButton
  inline def middle: middle = "middle".asInstanceOf[middle]
  
  @js.native
  sealed trait mutation
    extends StObject
       with PollingMethod
  inline def mutation: mutation = "mutation".asInstanceOf[mutation]
  
  @js.native
  sealed trait networkidle
    extends StObject
       with LifecycleEvent
  inline def networkidle: networkidle = "networkidle".asInstanceOf[networkidle]
  
  @js.native
  sealed trait `no-preference` extends StObject
  inline def `no-preference`: `no-preference` = "no-preference".asInstanceOf[`no-preference`]
  
  @js.native
  sealed trait none
    extends StObject
       with ResponseType
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait ntlm
    extends StObject
       with AuthMethod
  inline def ntlm: ntlm = "ntlm".asInstanceOf[ntlm]
  
  @js.native
  sealed trait onlyIPv4 extends StObject
  inline def onlyIPv4: onlyIPv4 = "onlyIPv4".asInstanceOf[onlyIPv4]
  
  @js.native
  sealed trait onlyIPv6 extends StObject
  inline def onlyIPv6: onlyIPv6 = "onlyIPv6".asInstanceOf[onlyIPv6]
  
  @js.native
  sealed trait open
    extends StObject
       with EventType
  inline def open: open = "open".asInstanceOf[open]
  
  @js.native
  sealed trait other
    extends StObject
       with ResourceType
  inline def other: other = "other".asInstanceOf[other]
  
  @js.native
  sealed trait `per-vu-iterations`
    extends StObject
       with ExecutorOptions
  inline def `per-vu-iterations`: `per-vu-iterations` = "per-vu-iterations".asInstanceOf[`per-vu-iterations`]
  
  @js.native
  sealed trait ping
    extends StObject
       with EventType
  inline def ping: ping = "ping".asInstanceOf[ping]
  
  @js.native
  sealed trait png
    extends StObject
       with ImageFormat
  inline def png: png = "png".asInstanceOf[png]
  
  @js.native
  sealed trait pong
    extends StObject
       with EventType
  inline def pong: pong = "pong".asInstanceOf[pong]
  
  @js.native
  sealed trait preferIPv4 extends StObject
  inline def preferIPv4: preferIPv4 = "preferIPv4".asInstanceOf[preferIPv4]
  
  @js.native
  sealed trait preferIPv6 extends StObject
  inline def preferIPv6: preferIPv6 = "preferIPv6".asInstanceOf[preferIPv6]
  
  @js.native
  sealed trait print extends StObject
  inline def print: print = "print".asInstanceOf[print]
  
  @js.native
  sealed trait `private` extends StObject
  inline def `private`: `private` = "private".asInstanceOf[`private`]
  
  @js.native
  sealed trait protanopia extends StObject
  inline def protanopia: protanopia = "protanopia".asInstanceOf[protanopia]
  
  @js.native
  sealed trait public extends StObject
  inline def public: public = "public".asInstanceOf[public]
  
  @js.native
  sealed trait raf
    extends StObject
       with PollingMethod
  inline def raf: raf = "raf".asInstanceOf[raf]
  
  @js.native
  sealed trait `ramping-arrival-rate`
    extends StObject
       with ExecutorOptions
  inline def `ramping-arrival-rate`: `ramping-arrival-rate` = "ramping-arrival-rate".asInstanceOf[`ramping-arrival-rate`]
  
  @js.native
  sealed trait `ramping-vus`
    extends StObject
       with ExecutorOptions
  inline def `ramping-vus`: `ramping-vus` = "ramping-vus".asInstanceOf[`ramping-vus`]
  
  @js.native
  sealed trait random extends StObject
  inline def random: random = "random".asInstanceOf[random]
  
  @js.native
  sealed trait raw extends StObject
  inline def raw: raw = "raw".asInstanceOf[raw]
  
  @js.native
  sealed trait rawstd
    extends StObject
       with Base64Variant
  inline def rawstd: rawstd = "rawstd".asInstanceOf[rawstd]
  
  @js.native
  sealed trait rawurl
    extends StObject
       with Base64Variant
  inline def rawurl: rawurl = "rawurl".asInstanceOf[rawurl]
  
  @js.native
  sealed trait reduce extends StObject
  inline def reduce: reduce = "reduce".asInstanceOf[reduce]
  
  @js.native
  sealed trait right
    extends StObject
       with MouseButton
  inline def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait ripemd160
    extends StObject
       with Algorithm
  inline def ripemd160: ripemd160 = "ripemd160".asInstanceOf[ripemd160]
  
  @js.native
  sealed trait roundRobin extends StObject
  inline def roundRobin: roundRobin = "roundRobin".asInstanceOf[roundRobin]
  
  @js.native
  sealed trait s extends StObject
  inline def s: s = "s".asInstanceOf[s]
  
  @js.native
  sealed trait screen extends StObject
  inline def screen: screen = "screen".asInstanceOf[screen]
  
  @js.native
  sealed trait script
    extends StObject
       with ResourceType
  inline def script: script = "script".asInstanceOf[script]
  
  @js.native
  sealed trait secret extends StObject
  inline def secret: secret = "secret".asInstanceOf[secret]
  
  @js.native
  sealed trait sha1
    extends StObject
       with Algorithm
  inline def sha1: sha1 = "sha1".asInstanceOf[sha1]
  
  @js.native
  sealed trait sha256
    extends StObject
       with Algorithm
  inline def sha256: sha256 = "sha256".asInstanceOf[sha256]
  
  @js.native
  sealed trait sha384
    extends StObject
       with Algorithm
  inline def sha384: sha384 = "sha384".asInstanceOf[sha384]
  
  @js.native
  sealed trait sha512
    extends StObject
       with Algorithm
  inline def sha512: sha512 = "sha512".asInstanceOf[sha512]
  
  @js.native
  sealed trait sha512_224
    extends StObject
       with Algorithm
  inline def sha512_224: sha512_224 = "sha512_224".asInstanceOf[sha512_224]
  
  @js.native
  sealed trait sha512_256
    extends StObject
       with Algorithm
  inline def sha512_256: sha512_256 = "sha512_256".asInstanceOf[sha512_256]
  
  @js.native
  sealed trait `shared-iterations`
    extends StObject
       with ExecutorOptions
  inline def `shared-iterations`: `shared-iterations` = "shared-iterations".asInstanceOf[`shared-iterations`]
  
  @js.native
  sealed trait sign extends StObject
  inline def sign: sign = "sign".asInstanceOf[sign]
  
  @js.native
  sealed trait std
    extends StObject
       with Base64Variant
  inline def std: std = "std".asInstanceOf[std]
  
  @js.native
  sealed trait stylesheet
    extends StObject
       with ResourceType
  inline def stylesheet: stylesheet = "stylesheet".asInstanceOf[stylesheet]
  
  @js.native
  sealed trait text
    extends StObject
       with ResponseType
  inline def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait texttrack
    extends StObject
       with ResourceType
  inline def texttrack: texttrack = "texttrack".asInstanceOf[texttrack]
  
  @js.native
  sealed trait tritanopia extends StObject
  inline def tritanopia: tritanopia = "tritanopia".asInstanceOf[tritanopia]
  
  @js.native
  sealed trait url
    extends StObject
       with Base64Variant
  inline def url: url = "url".asInstanceOf[url]
  
  @js.native
  sealed trait verify extends StObject
  inline def verify: verify = "verify".asInstanceOf[verify]
  
  @js.native
  sealed trait visible
    extends StObject
       with ElementState
       with InputElementState
  inline def visible: visible = "visible".asInstanceOf[visible]
  
  @js.native
  sealed trait w3c extends StObject
  inline def w3c: w3c = "w3c".asInstanceOf[w3c]
  
  @js.native
  sealed trait websocket
    extends StObject
       with ResourceType
  inline def websocket: websocket = "websocket".asInstanceOf[websocket]
  
  @js.native
  sealed trait xhr
    extends StObject
       with ResourceType
  inline def xhr: xhr = "xhr".asInstanceOf[xhr]
}
