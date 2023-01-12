package typings.httpHeaders

import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Parse the start-line and headers from an HTTP request or response.
    *
    * - Auto-detects and ignores body if present
    * - Fully [RFC 2068](http://www.rfc-base.org/txt/rfc-2068.txt) compliant
    * - Support multi-line headers (lines will be joined with a space)
    * - Support repeating headers
    *
    * @param data The data to parse.
    * @param [onlyHeaders=false] If `true`, only the headers object will be returned.
    *
    * @example
    * import * as net from 'net'
    * import httpHeaders = require('http-headers')
    *
    * // create TCP server
    * net.createServer((c) => {
    *   const buffers: Buffer[] = []
    *   c.on('data', buffers.push.bind(buffers))
    *   c.on('end', () => {
    *     const data = Buffer.concat(buffers)
    *
    *     // parse incoming data as an HTTP request and extra HTTP headers
    *     console.log(httpHeaders(data))
    *   })
    * }).listen(8080)
    *
    * @example
    * // If given an instance of `http.ServerResponse`, the response headers are
    * // automatically extracted, parsed and returned:
    *
    * import * as http from 'http'
    * import httpHeaders = require('http-headers')
    *
    * http.createServer((req, res) => {
    *   res.end('Hello World')
    *   console.log(httpHeaders(res))
    * }).listen(8080)
    */
  inline def apply(data: String): RequestData | ResponseData | Headers = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[RequestData | ResponseData | Headers]
  inline def apply(data: String, onlyHeaders: Boolean): RequestData | ResponseData | Headers = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], onlyHeaders.asInstanceOf[js.Any])).asInstanceOf[RequestData | ResponseData | Headers]
  inline def apply(data: Buffer): RequestData | ResponseData | Headers = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[RequestData | ResponseData | Headers]
  inline def apply(data: Buffer, onlyHeaders: Boolean): RequestData | ResponseData | Headers = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], onlyHeaders.asInstanceOf[js.Any])).asInstanceOf[RequestData | ResponseData | Headers]
  inline def apply(data: ServerResponse[IncomingMessage]): RequestData | ResponseData | Headers = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[RequestData | ResponseData | Headers]
  inline def apply(data: ServerResponse[IncomingMessage], onlyHeaders: Boolean): RequestData | ResponseData | Headers = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], onlyHeaders.asInstanceOf[js.Any])).asInstanceOf[RequestData | ResponseData | Headers]
  
  @JSImport("http-headers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Headers extends StObject {
    
    var `set-cookie`: js.UndefOr[js.Array[String]] = js.native
  }
  
  trait HttpVersion extends StObject {
    
    var major: Double
    
    var minor: Double
  }
  object HttpVersion {
    
    inline def apply(major: Double, minor: Double): HttpVersion = {
      val __obj = js.Dynamic.literal(major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpVersion]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpVersion] (val x: Self) extends AnyVal {
      
      inline def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
      
      inline def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestData extends StObject {
    
    var headers: Headers
    
    var method: String
    
    var url: String
    
    var version: HttpVersion
  }
  object RequestData {
    
    inline def apply(headers: Headers, method: String, url: String, version: HttpVersion): RequestData = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestData] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: HttpVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResponseData extends StObject {
    
    var headers: Headers
    
    var statusCode: Double
    
    var statusMessage: String
    
    var version: HttpVersion
  }
  object ResponseData {
    
    inline def apply(headers: Headers, statusCode: Double, statusMessage: String, version: HttpVersion): ResponseData = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponseData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResponseData] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: HttpVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
