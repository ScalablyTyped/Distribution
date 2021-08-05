package typings.k6

import typings.k6.cryptoMod.Algorithm
import typings.k6.cryptoMod.StringEncoding
import typings.k6.encodingMod.Base64Variant
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
  sealed trait BatchResponses extends StObject
  inline def BatchResponses: BatchResponses = "BatchResponses".asInstanceOf[BatchResponses]
  
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
  sealed trait digest
    extends StObject
       with AuthMethod
  inline def digest: digest = "digest".asInstanceOf[digest]
  
  @js.native
  sealed trait error
    extends StObject
       with EventType
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait `externally-controlled`
    extends StObject
       with ExecutorOptions
  inline def `externally-controlled`: `externally-controlled` = "externally-controlled".asInstanceOf[`externally-controlled`]
  
  @js.native
  sealed trait hex
    extends StObject
       with StringEncoding
  inline def hex: hex = "hex".asInstanceOf[hex]
  
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
  sealed trait message
    extends StObject
       with EventType
  inline def message: message = "message".asInstanceOf[message]
  
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
  sealed trait open
    extends StObject
       with EventType
  inline def open: open = "open".asInstanceOf[open]
  
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
  sealed trait pong
    extends StObject
       with EventType
  inline def pong: pong = "pong".asInstanceOf[pong]
  
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
  sealed trait ripemd160
    extends StObject
       with Algorithm
  inline def ripemd160: ripemd160 = "ripemd160".asInstanceOf[ripemd160]
  
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
  sealed trait std
    extends StObject
       with Base64Variant
  inline def std: std = "std".asInstanceOf[std]
  
  @js.native
  sealed trait text
    extends StObject
       with ResponseType
  inline def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait url
    extends StObject
       with Base64Variant
  inline def url: url = "url".asInstanceOf[url]
}
