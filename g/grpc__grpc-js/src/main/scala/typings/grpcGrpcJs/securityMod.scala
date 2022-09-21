package typings.grpcGrpcJs

import typings.grpcGrpcJs.anyMod.Any
import typings.grpcGrpcJs.anyMod.AnyOutput
import typings.grpcGrpcJs.grpcGrpcJsStrings.other
import typings.grpcGrpcJs.grpcGrpcJsStrings.other_name
import typings.grpcGrpcJs.grpcGrpcJsStrings.standard_name
import typings.grpcGrpcJs.grpcGrpcJsStrings.tls
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object securityMod {
  
  trait Security extends StObject {
    
    var model: js.UndefOr[tls | other] = js.undefined
    
    var other: js.UndefOr[grpcChannelzV1SecurityOtherSecurity | Null] = js.undefined
    
    var tls: js.UndefOr[grpcChannelzV1SecurityTls | Null] = js.undefined
  }
  object Security {
    
    inline def apply(): Security = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Security]
    }
    
    extension [Self <: Security](x: Self) {
      
      inline def setModel(value: tls | other): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setOther(value: grpcChannelzV1SecurityOtherSecurity): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      inline def setOtherNull: Self = StObject.set(x, "other", null)
      
      inline def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
      
      inline def setTls(value: grpcChannelzV1SecurityTls): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      inline def setTlsNull: Self = StObject.set(x, "tls", null)
      
      inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
    }
  }
  
  trait SecurityOutput extends StObject {
    
    var model: tls | other
    
    var other: js.UndefOr[grpcChannelzV1SecurityOtherSecurityOutput | Null] = js.undefined
    
    var tls: js.UndefOr[grpcChannelzV1SecurityTlsOutput | Null] = js.undefined
  }
  object SecurityOutput {
    
    inline def apply(model: tls | other): SecurityOutput = {
      val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
      __obj.asInstanceOf[SecurityOutput]
    }
    
    extension [Self <: SecurityOutput](x: Self) {
      
      inline def setModel(value: tls | other): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setOther(value: grpcChannelzV1SecurityOtherSecurityOutput): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      inline def setOtherNull: Self = StObject.set(x, "other", null)
      
      inline def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
      
      inline def setTls(value: grpcChannelzV1SecurityTlsOutput): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      inline def setTlsNull: Self = StObject.set(x, "tls", null)
      
      inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
    }
  }
  
  trait grpcChannelzV1SecurityOtherSecurity extends StObject {
    
    /**
      * The human readable version of the value.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * The actual security details message.
      */
    var value: js.UndefOr[Any | Null] = js.undefined
  }
  object grpcChannelzV1SecurityOtherSecurity {
    
    inline def apply(): grpcChannelzV1SecurityOtherSecurity = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[grpcChannelzV1SecurityOtherSecurity]
    }
    
    extension [Self <: grpcChannelzV1SecurityOtherSecurity](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait grpcChannelzV1SecurityOtherSecurityOutput extends StObject {
    
    /**
      * The human readable version of the value.
      */
    var name: String
    
    /**
      * The actual security details message.
      */
    var value: AnyOutput | Null
  }
  object grpcChannelzV1SecurityOtherSecurityOutput {
    
    inline def apply(name: String): grpcChannelzV1SecurityOtherSecurityOutput = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = null)
      __obj.asInstanceOf[grpcChannelzV1SecurityOtherSecurityOutput]
    }
    
    extension [Self <: grpcChannelzV1SecurityOtherSecurityOutput](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: AnyOutput): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
    }
  }
  
  trait grpcChannelzV1SecurityTls extends StObject {
    
    var cipher_suite: js.UndefOr[standard_name | other_name] = js.undefined
    
    /**
      * the certificate used by this endpoint.
      */
    var local_certificate: js.UndefOr[Buffer | js.typedarray.Uint8Array | String] = js.undefined
    
    /**
      * Some other way to describe the cipher suite if
      * the RFC 4346 name is not available.
      */
    var other_name: js.UndefOr[String] = js.undefined
    
    /**
      * the certificate used by the remote endpoint.
      */
    var remote_certificate: js.UndefOr[Buffer | js.typedarray.Uint8Array | String] = js.undefined
    
    /**
      * The cipher suite name in the RFC 4346 format:
      * https://tools.ietf.org/html/rfc4346#appendix-C
      */
    var standard_name: js.UndefOr[String] = js.undefined
  }
  object grpcChannelzV1SecurityTls {
    
    inline def apply(): grpcChannelzV1SecurityTls = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[grpcChannelzV1SecurityTls]
    }
    
    extension [Self <: grpcChannelzV1SecurityTls](x: Self) {
      
      inline def setCipher_suite(value: standard_name | other_name): Self = StObject.set(x, "cipher_suite", value.asInstanceOf[js.Any])
      
      inline def setCipher_suiteUndefined: Self = StObject.set(x, "cipher_suite", js.undefined)
      
      inline def setLocal_certificate(value: Buffer | js.typedarray.Uint8Array | String): Self = StObject.set(x, "local_certificate", value.asInstanceOf[js.Any])
      
      inline def setLocal_certificateUndefined: Self = StObject.set(x, "local_certificate", js.undefined)
      
      inline def setOther_name(value: String): Self = StObject.set(x, "other_name", value.asInstanceOf[js.Any])
      
      inline def setOther_nameUndefined: Self = StObject.set(x, "other_name", js.undefined)
      
      inline def setRemote_certificate(value: Buffer | js.typedarray.Uint8Array | String): Self = StObject.set(x, "remote_certificate", value.asInstanceOf[js.Any])
      
      inline def setRemote_certificateUndefined: Self = StObject.set(x, "remote_certificate", js.undefined)
      
      inline def setStandard_name(value: String): Self = StObject.set(x, "standard_name", value.asInstanceOf[js.Any])
      
      inline def setStandard_nameUndefined: Self = StObject.set(x, "standard_name", js.undefined)
    }
  }
  
  trait grpcChannelzV1SecurityTlsOutput extends StObject {
    
    var cipher_suite: standard_name | other_name
    
    /**
      * the certificate used by this endpoint.
      */
    var local_certificate: Buffer
    
    /**
      * Some other way to describe the cipher suite if
      * the RFC 4346 name is not available.
      */
    var other_name: js.UndefOr[String] = js.undefined
    
    /**
      * the certificate used by the remote endpoint.
      */
    var remote_certificate: Buffer
    
    /**
      * The cipher suite name in the RFC 4346 format:
      * https://tools.ietf.org/html/rfc4346#appendix-C
      */
    var standard_name: js.UndefOr[String] = js.undefined
  }
  object grpcChannelzV1SecurityTlsOutput {
    
    inline def apply(cipher_suite: standard_name | other_name, local_certificate: Buffer, remote_certificate: Buffer): grpcChannelzV1SecurityTlsOutput = {
      val __obj = js.Dynamic.literal(cipher_suite = cipher_suite.asInstanceOf[js.Any], local_certificate = local_certificate.asInstanceOf[js.Any], remote_certificate = remote_certificate.asInstanceOf[js.Any])
      __obj.asInstanceOf[grpcChannelzV1SecurityTlsOutput]
    }
    
    extension [Self <: grpcChannelzV1SecurityTlsOutput](x: Self) {
      
      inline def setCipher_suite(value: standard_name | other_name): Self = StObject.set(x, "cipher_suite", value.asInstanceOf[js.Any])
      
      inline def setLocal_certificate(value: Buffer): Self = StObject.set(x, "local_certificate", value.asInstanceOf[js.Any])
      
      inline def setOther_name(value: String): Self = StObject.set(x, "other_name", value.asInstanceOf[js.Any])
      
      inline def setOther_nameUndefined: Self = StObject.set(x, "other_name", js.undefined)
      
      inline def setRemote_certificate(value: Buffer): Self = StObject.set(x, "remote_certificate", value.asInstanceOf[js.Any])
      
      inline def setStandard_name(value: String): Self = StObject.set(x, "standard_name", value.asInstanceOf[js.Any])
      
      inline def setStandard_nameUndefined: Self = StObject.set(x, "standard_name", js.undefined)
    }
  }
}
