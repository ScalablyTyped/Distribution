package typings.http2Wrapper

import typings.http2Wrapper.http2WrapperBooleans.`false`
import typings.http2Wrapper.http2WrapperStrings.fifo
import typings.http2Wrapper.http2WrapperStrings.lifo
import typings.http2Wrapper.mod.AutoRequestOptions
import typings.http2Wrapper.mod.ProxyOptions
import typings.http2Wrapper.mod.ResolveProtocolConnectFunction
import typings.http2Wrapper.mod.ResolveProtocolFunction
import typings.http2Wrapper.mod.ResolveProtocolResult
import typings.node.bufferMod.global.Buffer
import typings.node.dnsMod.LookupOneOptions
import typings.node.httpMod.Agent
import typings.node.netMod.LookupFunction
import typings.node.netMod.OnReadOpts
import typings.node.streamMod.Duplex
import typings.node.tlsMod.KeyObject
import typings.node.tlsMod.PSKCallbackNegotation
import typings.node.tlsMod.PeerCertificate
import typings.node.tlsMod.PxfObject
import typings.node.tlsMod.SecureContext
import typings.node.tlsMod.SecureVersion
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined node.http.AgentOptions & {  proxyOptions :http2-wrapper.http2-wrapper.ProxyOptions} */
  trait AgentOptionsproxyOptionsP extends StObject {
    
    var family: js.UndefOr[Double] = js.undefined
    
    var hints: js.UndefOr[Double] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    /**
      * Keep sockets around in a pool to be used by other requests in the future. Default = false
      */
    var keepAlive: js.UndefOr[Boolean] = js.undefined
    
    var keepAliveInitialDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * When using HTTP KeepAlive, how often to send TCP KeepAlive packets over sockets being kept alive. Default = 1000.
      * Only relevant if keepAlive is set to true.
      */
    var keepAliveMsecs: js.UndefOr[Double] = js.undefined
    
    var localAddress: js.UndefOr[String] = js.undefined
    
    var localPort: js.UndefOr[Double] = js.undefined
    
    var lookup: js.UndefOr[LookupFunction] = js.undefined
    
    /**
      * Maximum number of sockets to leave open in a free state. Only relevant if keepAlive is set to true. Default = 256.
      */
    var maxFreeSockets: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum number of sockets to allow per host. Default for Node 0.10 is 5, default for Node 0.12 is Infinity
      */
    var maxSockets: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum number of sockets allowed for all hosts in total. Each request will use a new socket until the maximum is reached. Default: Infinity.
      */
    var maxTotalSockets: js.UndefOr[Double] = js.undefined
    
    var noDelay: js.UndefOr[Boolean] = js.undefined
    
    var onread: js.UndefOr[OnReadOpts] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var proxyOptions: ProxyOptions
    
    /**
      * Scheduling strategy to apply when picking the next free socket to use.
      * @default `lifo`
      */
    var scheduling: js.UndefOr[fifo | lifo] = js.undefined
    
    /**
      * Socket timeout in milliseconds. This will set the timeout after the socket is connected.
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object AgentOptionsproxyOptionsP {
    
    inline def apply(proxyOptions: ProxyOptions): AgentOptionsproxyOptionsP = {
      val __obj = js.Dynamic.literal(proxyOptions = proxyOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[AgentOptionsproxyOptionsP]
    }
    
    extension [Self <: AgentOptionsproxyOptionsP](x: Self) {
      
      inline def setFamily(value: Double): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      inline def setHints(value: Double): Self = StObject.set(x, "hints", value.asInstanceOf[js.Any])
      
      inline def setHintsUndefined: Self = StObject.set(x, "hints", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveInitialDelay(value: Double): Self = StObject.set(x, "keepAliveInitialDelay", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveInitialDelayUndefined: Self = StObject.set(x, "keepAliveInitialDelay", js.undefined)
      
      inline def setKeepAliveMsecs(value: Double): Self = StObject.set(x, "keepAliveMsecs", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveMsecsUndefined: Self = StObject.set(x, "keepAliveMsecs", js.undefined)
      
      inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      inline def setLocalPort(value: Double): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
      
      inline def setLocalPortUndefined: Self = StObject.set(x, "localPort", js.undefined)
      
      inline def setLookup(
        value: (/* hostname */ String, /* options */ LookupOneOptions, /* callback */ js.Function3[
              /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
              /* address */ String, 
              /* family */ Double, 
              Unit
            ]) => Unit
      ): Self = StObject.set(x, "lookup", js.Any.fromFunction3(value))
      
      inline def setLookupUndefined: Self = StObject.set(x, "lookup", js.undefined)
      
      inline def setMaxFreeSockets(value: Double): Self = StObject.set(x, "maxFreeSockets", value.asInstanceOf[js.Any])
      
      inline def setMaxFreeSocketsUndefined: Self = StObject.set(x, "maxFreeSockets", js.undefined)
      
      inline def setMaxSockets(value: Double): Self = StObject.set(x, "maxSockets", value.asInstanceOf[js.Any])
      
      inline def setMaxSocketsUndefined: Self = StObject.set(x, "maxSockets", js.undefined)
      
      inline def setMaxTotalSockets(value: Double): Self = StObject.set(x, "maxTotalSockets", value.asInstanceOf[js.Any])
      
      inline def setMaxTotalSocketsUndefined: Self = StObject.set(x, "maxTotalSockets", js.undefined)
      
      inline def setNoDelay(value: Boolean): Self = StObject.set(x, "noDelay", value.asInstanceOf[js.Any])
      
      inline def setNoDelayUndefined: Self = StObject.set(x, "noDelay", js.undefined)
      
      inline def setOnread(value: OnReadOpts): Self = StObject.set(x, "onread", value.asInstanceOf[js.Any])
      
      inline def setOnreadUndefined: Self = StObject.set(x, "onread", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProxyOptions(value: ProxyOptions): Self = StObject.set(x, "proxyOptions", value.asInstanceOf[js.Any])
      
      inline def setScheduling(value: fifo | lifo): Self = StObject.set(x, "scheduling", value.asInstanceOf[js.Any])
      
      inline def setSchedulingUndefined: Self = StObject.set(x, "scheduling", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  /* Inlined node.https.AgentOptions & {  proxyOptions :http2-wrapper.http2-wrapper.ProxyOptions} */
  trait AgentOptionsproxyOptionsPALPNProtocols extends StObject {
    
    /**
      * An array of strings or a Buffer naming possible ALPN protocols.
      * (Protocols should be ordered by their priority.)
      */
    var ALPNProtocols: js.UndefOr[(js.Array[String | js.typedarray.Uint8Array]) | js.typedarray.Uint8Array] = js.undefined
    
    /**
      * SNICallback(servername, cb) <Function> A function that will be
      * called if the client supports SNI TLS extension. Two arguments
      * will be passed when called: servername and cb. SNICallback should
      * invoke cb(null, ctx), where ctx is a SecureContext instance.
      * (tls.createSecureContext(...) can be used to get a proper
      * SecureContext.) If SNICallback wasn't provided the default callback
      * with high-level API will be used (see below).
      */
    var SNICallback: js.UndefOr[
        js.Function2[
          /* servername */ String, 
          /* cb */ js.Function2[/* err */ js.Error | Null, /* ctx */ js.UndefOr[SecureContext], Unit], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Optionally override the trusted CA certificates. Default is to trust
      * the well-known CAs curated by Mozilla. Mozilla's CAs are completely
      * replaced when CAs are explicitly specified using this option.
      */
    var ca: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
    
    /**
      *  Cert chains in PEM format. One cert chain should be provided per
      *  private key. Each cert chain should consist of the PEM formatted
      *  certificate for a provided private key, followed by the PEM
      *  formatted intermediate certificates (if any), in order, and not
      *  including the root CA (the root CA must be pre-known to the peer,
      *  see ca). When providing multiple cert chains, they do not have to
      *  be in the same order as their private keys in key. If the
      *  intermediate certificates are not provided, the peer will not be
      *  able to validate the certificate, and the handshake will fail.
      */
    var cert: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
    
    // Establish secure connection on a given socket rather than creating a new socket
    var checkServerIdentity: js.UndefOr[
        js.Function2[/* hostname */ String, /* cert */ PeerCertificate, js.UndefOr[js.Error]]
      ] = js.undefined
    
    /**
      * Cipher suite specification, replacing the default. For more
      * information, see modifying the default cipher suite. Permitted
      * ciphers can be obtained via tls.getCiphers(). Cipher names must be
      * uppercased in order for OpenSSL to accept them.
      */
    var ciphers: js.UndefOr[String] = js.undefined
    
    /**
      * Name of an OpenSSL engine which can provide the client certificate.
      */
    var clientCertEngine: js.UndefOr[String] = js.undefined
    
    /**
      * PEM formatted CRLs (Certificate Revocation Lists).
      */
    var crl: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
    
    /**
      * Diffie Hellman parameters, required for Perfect Forward Secrecy. Use
      * openssl dhparam to create the parameters. The key length must be
      * greater than or equal to 1024 bits or else an error will be thrown.
      * Although 1024 bits is permissible, use 2048 bits or larger for
      * stronger security. If omitted or invalid, the parameters are
      * silently discarded and DHE ciphers will not be available.
      */
    var dhparam: js.UndefOr[String | Buffer] = js.undefined
    
    /**
      * A string describing a named curve or a colon separated list of curve
      * NIDs or names, for example P-521:P-384:P-256, to use for ECDH key
      * agreement. Set to auto to select the curve automatically. Use
      * crypto.getCurves() to obtain a list of available curve names. On
      * recent releases, openssl ecparam -list_curves will also display the
      * name and description of each available elliptic curve. Default:
      * tls.DEFAULT_ECDH_CURVE.
      */
    var ecdhCurve: js.UndefOr[String] = js.undefined
    
    /**
      * When enabled, TLS packet trace information is written to `stderr`. This can be
      * used to debug TLS connection problems.
      * @default false
      */
    var enableTrace: js.UndefOr[Boolean] = js.undefined
    
    var family: js.UndefOr[Double] = js.undefined
    
    var hints: js.UndefOr[Double] = js.undefined
    
    /**
      * Attempt to use the server's cipher suite preferences instead of the
      * client's. When true, causes SSL_OP_CIPHER_SERVER_PREFERENCE to be
      * set in secureOptions
      */
    var honorCipherOrder: js.UndefOr[Boolean] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    /**
      * Keep sockets around in a pool to be used by other requests in the future. Default = false
      */
    var keepAlive: js.UndefOr[Boolean] = js.undefined
    
    var keepAliveInitialDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * When using HTTP KeepAlive, how often to send TCP KeepAlive packets over sockets being kept alive. Default = 1000.
      * Only relevant if keepAlive is set to true.
      */
    var keepAliveMsecs: js.UndefOr[Double] = js.undefined
    
    /**
      * Private keys in PEM format. PEM allows the option of private keys
      * being encrypted. Encrypted keys will be decrypted with
      * options.passphrase. Multiple keys using different algorithms can be
      * provided either as an array of unencrypted key strings or buffers,
      * or an array of objects in the form {pem: <string|buffer>[,
      * passphrase: <string>]}. The object form can only occur in an array.
      * object.passphrase is optional. Encrypted keys will be decrypted with
      * object.passphrase if provided, or options.passphrase if it is not.
      */
    var key: js.UndefOr[String | Buffer | (js.Array[String | Buffer | KeyObject])] = js.undefined
    
    var localAddress: js.UndefOr[String] = js.undefined
    
    var localPort: js.UndefOr[Double] = js.undefined
    
    var lookup: js.UndefOr[LookupFunction] = js.undefined
    
    var maxCachedSessions: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum number of sockets to leave open in a free state. Only relevant if keepAlive is set to true. Default = 256.
      */
    var maxFreeSockets: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum number of sockets to allow per host. Default for Node 0.10 is 5, default for Node 0.12 is Infinity
      */
    var maxSockets: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum number of sockets allowed for all hosts in total. Each request will use a new socket until the maximum is reached. Default: Infinity.
      */
    var maxTotalSockets: js.UndefOr[Double] = js.undefined
    
    /**
      * Optionally set the maximum TLS version to allow. One
      * of `'TLSv1.3'`, `'TLSv1.2'`, `'TLSv1.1'`, or `'TLSv1'`. Cannot be specified along with the
      * `secureProtocol` option, use one or the other.
      * **Default:** `'TLSv1.3'`, unless changed using CLI options. Using
      * `--tls-max-v1.2` sets the default to `'TLSv1.2'`. Using `--tls-max-v1.3` sets the default to
      * `'TLSv1.3'`. If multiple of the options are provided, the highest maximum is used.
      */
    var maxVersion: js.UndefOr[SecureVersion] = js.undefined
    
    var minDHSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Optionally set the minimum TLS version to allow. One
      * of `'TLSv1.3'`, `'TLSv1.2'`, `'TLSv1.1'`, or `'TLSv1'`. Cannot be specified along with the
      * `secureProtocol` option, use one or the other.  It is not recommended to use
      * less than TLSv1.2, but it may be required for interoperability.
      * **Default:** `'TLSv1.2'`, unless changed using CLI options. Using
      * `--tls-v1.0` sets the default to `'TLSv1'`. Using `--tls-v1.1` sets the default to
      * `'TLSv1.1'`. Using `--tls-min-v1.3` sets the default to
      * 'TLSv1.3'. If multiple of the options are provided, the lowest minimum is used.
      */
    var minVersion: js.UndefOr[SecureVersion] = js.undefined
    
    var noDelay: js.UndefOr[Boolean] = js.undefined
    
    var onread: js.UndefOr[OnReadOpts] = js.undefined
    
    /**
      * Shared passphrase used for a single private key and/or a PFX.
      */
    var passphrase: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * PFX or PKCS12 encoded private key and certificate chain. pfx is an
      * alternative to providing key and cert individually. PFX is usually
      * encrypted, if it is, passphrase will be used to decrypt it. Multiple
      * PFX can be provided either as an array of unencrypted PFX buffers,
      * or an array of objects in the form {buf: <string|buffer>[,
      * passphrase: <string>]}. The object form can only occur in an array.
      * object.passphrase is optional. Encrypted PFX will be decrypted with
      * object.passphrase if provided, or options.passphrase if it is not.
      */
    var pfx: js.UndefOr[String | Buffer | (js.Array[String | Buffer | PxfObject])] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    /**
      * Name of an OpenSSL engine to get private key from. Should be used
      * together with privateKeyIdentifier.
      */
    var privateKeyEngine: js.UndefOr[String] = js.undefined
    
    /**
      * Identifier of a private key managed by an OpenSSL engine. Should be
      * used together with privateKeyEngine. Should not be set together with
      * key, because both options define a private key in different ways.
      */
    var privateKeyIdentifier: js.UndefOr[String] = js.undefined
    
    var proxyOptions: ProxyOptions
    
    /**
      * When negotiating TLS-PSK (pre-shared keys), this function is called
      * with optional identity `hint` provided by the server or `null`
      * in case of TLS 1.3 where `hint` was removed.
      * It will be necessary to provide a custom `tls.checkServerIdentity()`
      * for the connection as the default one will try to check hostname/IP
      * of the server against the certificate but that's not applicable for PSK
      * because there won't be a certificate present.
      * More information can be found in the RFC 4279.
      *
      * @param hint message sent from the server to help client
      * decide which identity to use during negotiation.
      * Always `null` if TLS 1.3 is used.
      * @returns Return `null` to stop the negotiation process. `psk` must be
      * compatible with the selected cipher's digest.
      * `identity` must use UTF-8 encoding.
      */
    var pskCallback: js.UndefOr[js.Function1[/* hint */ String | Null, PSKCallbackNegotation | Null]] = js.undefined
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true the server will request a certificate from clients that
      * connect and attempt to verify that certificate. Defaults to
      * false.
      */
    var requestCert: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Scheduling strategy to apply when picking the next free socket to use.
      * @default `lifo`
      */
    var scheduling: js.UndefOr[fifo | lifo] = js.undefined
    
    /**
      * An optional TLS context object from tls.createSecureContext()
      */
    var secureContext: js.UndefOr[SecureContext] = js.undefined
    
    /**
      * Optionally affect the OpenSSL protocol behavior, which is not
      * usually necessary. This should be used carefully if at all! Value is
      * a numeric bitmask of the SSL_OP_* options from OpenSSL Options
      */
    var secureOptions: js.UndefOr[Double] = js.undefined
    
    // Value is a numeric bitmask of the `SSL_OP_*` options
    /**
      * Legacy mechanism to select the TLS protocol version to use, it does
      * not support independent control of the minimum and maximum version,
      * and does not support limiting the protocol to TLSv1.3. Use
      * minVersion and maxVersion instead. The possible values are listed as
      * SSL_METHODS, use the function names as strings. For example, use
      * 'TLSv1_1_method' to force TLS version 1.1, or 'TLS_method' to allow
      * any TLS protocol version up to TLSv1.3. It is not recommended to use
      * TLS versions less than 1.2, but it may be required for
      * interoperability. Default: none, see minVersion.
      */
    var secureProtocol: js.UndefOr[String] = js.undefined
    
    var servername: js.UndefOr[String] = js.undefined
    
    // SNI TLS Extension
    var session: js.UndefOr[Buffer] = js.undefined
    
    /**
      * Opaque identifier used by servers to ensure session state is not
      * shared between applications. Unused by clients.
      */
    var sessionIdContext: js.UndefOr[String] = js.undefined
    
    /**
      * The number of seconds after which a TLS session created by the
      * server will no longer be resumable. See Session Resumption for more
      * information. Default: 300.
      */
    var sessionTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      *  Colon-separated list of supported signature algorithms. The list
      *  can contain digest algorithms (SHA256, MD5 etc.), public key
      *  algorithms (RSA-PSS, ECDSA etc.), combination of both (e.g
      *  'RSA+SHA384') or TLS v1.3 scheme names (e.g. rsa_pss_pss_sha512).
      */
    var sigalgs: js.UndefOr[String] = js.undefined
    
    // Creates unix socket connection to path. If this option is specified, `host` and `port` are ignored.
    var socket: js.UndefOr[Duplex] = js.undefined
    
    /**
      * 48-bytes of cryptographically strong pseudo-random data.
      * See Session Resumption for more information.
      */
    var ticketKeys: js.UndefOr[Buffer] = js.undefined
    
    /**
      * Socket timeout in milliseconds. This will set the timeout after the socket is connected.
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object AgentOptionsproxyOptionsPALPNProtocols {
    
    inline def apply(proxyOptions: ProxyOptions): AgentOptionsproxyOptionsPALPNProtocols = {
      val __obj = js.Dynamic.literal(proxyOptions = proxyOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[AgentOptionsproxyOptionsPALPNProtocols]
    }
    
    extension [Self <: AgentOptionsproxyOptionsPALPNProtocols](x: Self) {
      
      inline def setALPNProtocols(value: (js.Array[String | js.typedarray.Uint8Array]) | js.typedarray.Uint8Array): Self = StObject.set(x, "ALPNProtocols", value.asInstanceOf[js.Any])
      
      inline def setALPNProtocolsUndefined: Self = StObject.set(x, "ALPNProtocols", js.undefined)
      
      inline def setALPNProtocolsVarargs(value: (String | js.typedarray.Uint8Array)*): Self = StObject.set(x, "ALPNProtocols", js.Array(value*))
      
      inline def setCa(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      inline def setCaVarargs(value: (String | Buffer)*): Self = StObject.set(x, "ca", js.Array(value*))
      
      inline def setCert(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setCertVarargs(value: (String | Buffer)*): Self = StObject.set(x, "cert", js.Array(value*))
      
      inline def setCheckServerIdentity(value: (/* hostname */ String, /* cert */ PeerCertificate) => js.UndefOr[js.Error]): Self = StObject.set(x, "checkServerIdentity", js.Any.fromFunction2(value))
      
      inline def setCheckServerIdentityUndefined: Self = StObject.set(x, "checkServerIdentity", js.undefined)
      
      inline def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
      
      inline def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
      
      inline def setClientCertEngine(value: String): Self = StObject.set(x, "clientCertEngine", value.asInstanceOf[js.Any])
      
      inline def setClientCertEngineUndefined: Self = StObject.set(x, "clientCertEngine", js.undefined)
      
      inline def setCrl(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "crl", value.asInstanceOf[js.Any])
      
      inline def setCrlUndefined: Self = StObject.set(x, "crl", js.undefined)
      
      inline def setCrlVarargs(value: (String | Buffer)*): Self = StObject.set(x, "crl", js.Array(value*))
      
      inline def setDhparam(value: String | Buffer): Self = StObject.set(x, "dhparam", value.asInstanceOf[js.Any])
      
      inline def setDhparamUndefined: Self = StObject.set(x, "dhparam", js.undefined)
      
      inline def setEcdhCurve(value: String): Self = StObject.set(x, "ecdhCurve", value.asInstanceOf[js.Any])
      
      inline def setEcdhCurveUndefined: Self = StObject.set(x, "ecdhCurve", js.undefined)
      
      inline def setEnableTrace(value: Boolean): Self = StObject.set(x, "enableTrace", value.asInstanceOf[js.Any])
      
      inline def setEnableTraceUndefined: Self = StObject.set(x, "enableTrace", js.undefined)
      
      inline def setFamily(value: Double): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      inline def setHints(value: Double): Self = StObject.set(x, "hints", value.asInstanceOf[js.Any])
      
      inline def setHintsUndefined: Self = StObject.set(x, "hints", js.undefined)
      
      inline def setHonorCipherOrder(value: Boolean): Self = StObject.set(x, "honorCipherOrder", value.asInstanceOf[js.Any])
      
      inline def setHonorCipherOrderUndefined: Self = StObject.set(x, "honorCipherOrder", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveInitialDelay(value: Double): Self = StObject.set(x, "keepAliveInitialDelay", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveInitialDelayUndefined: Self = StObject.set(x, "keepAliveInitialDelay", js.undefined)
      
      inline def setKeepAliveMsecs(value: Double): Self = StObject.set(x, "keepAliveMsecs", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveMsecsUndefined: Self = StObject.set(x, "keepAliveMsecs", js.undefined)
      
      inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      inline def setKey(value: String | Buffer | (js.Array[String | Buffer | KeyObject])): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setKeyVarargs(value: (String | Buffer | KeyObject)*): Self = StObject.set(x, "key", js.Array(value*))
      
      inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      inline def setLocalPort(value: Double): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
      
      inline def setLocalPortUndefined: Self = StObject.set(x, "localPort", js.undefined)
      
      inline def setLookup(
        value: (/* hostname */ String, /* options */ LookupOneOptions, /* callback */ js.Function3[
              /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
              /* address */ String, 
              /* family */ Double, 
              Unit
            ]) => Unit
      ): Self = StObject.set(x, "lookup", js.Any.fromFunction3(value))
      
      inline def setLookupUndefined: Self = StObject.set(x, "lookup", js.undefined)
      
      inline def setMaxCachedSessions(value: Double): Self = StObject.set(x, "maxCachedSessions", value.asInstanceOf[js.Any])
      
      inline def setMaxCachedSessionsUndefined: Self = StObject.set(x, "maxCachedSessions", js.undefined)
      
      inline def setMaxFreeSockets(value: Double): Self = StObject.set(x, "maxFreeSockets", value.asInstanceOf[js.Any])
      
      inline def setMaxFreeSocketsUndefined: Self = StObject.set(x, "maxFreeSockets", js.undefined)
      
      inline def setMaxSockets(value: Double): Self = StObject.set(x, "maxSockets", value.asInstanceOf[js.Any])
      
      inline def setMaxSocketsUndefined: Self = StObject.set(x, "maxSockets", js.undefined)
      
      inline def setMaxTotalSockets(value: Double): Self = StObject.set(x, "maxTotalSockets", value.asInstanceOf[js.Any])
      
      inline def setMaxTotalSocketsUndefined: Self = StObject.set(x, "maxTotalSockets", js.undefined)
      
      inline def setMaxVersion(value: SecureVersion): Self = StObject.set(x, "maxVersion", value.asInstanceOf[js.Any])
      
      inline def setMaxVersionUndefined: Self = StObject.set(x, "maxVersion", js.undefined)
      
      inline def setMinDHSize(value: Double): Self = StObject.set(x, "minDHSize", value.asInstanceOf[js.Any])
      
      inline def setMinDHSizeUndefined: Self = StObject.set(x, "minDHSize", js.undefined)
      
      inline def setMinVersion(value: SecureVersion): Self = StObject.set(x, "minVersion", value.asInstanceOf[js.Any])
      
      inline def setMinVersionUndefined: Self = StObject.set(x, "minVersion", js.undefined)
      
      inline def setNoDelay(value: Boolean): Self = StObject.set(x, "noDelay", value.asInstanceOf[js.Any])
      
      inline def setNoDelayUndefined: Self = StObject.set(x, "noDelay", js.undefined)
      
      inline def setOnread(value: OnReadOpts): Self = StObject.set(x, "onread", value.asInstanceOf[js.Any])
      
      inline def setOnreadUndefined: Self = StObject.set(x, "onread", js.undefined)
      
      inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPfx(value: String | Buffer | (js.Array[String | Buffer | PxfObject])): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
      
      inline def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
      
      inline def setPfxVarargs(value: (String | Buffer | PxfObject)*): Self = StObject.set(x, "pfx", js.Array(value*))
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setPrivateKeyEngine(value: String): Self = StObject.set(x, "privateKeyEngine", value.asInstanceOf[js.Any])
      
      inline def setPrivateKeyEngineUndefined: Self = StObject.set(x, "privateKeyEngine", js.undefined)
      
      inline def setPrivateKeyIdentifier(value: String): Self = StObject.set(x, "privateKeyIdentifier", value.asInstanceOf[js.Any])
      
      inline def setPrivateKeyIdentifierUndefined: Self = StObject.set(x, "privateKeyIdentifier", js.undefined)
      
      inline def setProxyOptions(value: ProxyOptions): Self = StObject.set(x, "proxyOptions", value.asInstanceOf[js.Any])
      
      inline def setPskCallback(value: /* hint */ String | Null => PSKCallbackNegotation | Null): Self = StObject.set(x, "pskCallback", js.Any.fromFunction1(value))
      
      inline def setPskCallbackUndefined: Self = StObject.set(x, "pskCallback", js.undefined)
      
      inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      inline def setRequestCert(value: Boolean): Self = StObject.set(x, "requestCert", value.asInstanceOf[js.Any])
      
      inline def setRequestCertUndefined: Self = StObject.set(x, "requestCert", js.undefined)
      
      inline def setSNICallback(
        value: (/* servername */ String, /* cb */ js.Function2[/* err */ js.Error | Null, /* ctx */ js.UndefOr[SecureContext], Unit]) => Unit
      ): Self = StObject.set(x, "SNICallback", js.Any.fromFunction2(value))
      
      inline def setSNICallbackUndefined: Self = StObject.set(x, "SNICallback", js.undefined)
      
      inline def setScheduling(value: fifo | lifo): Self = StObject.set(x, "scheduling", value.asInstanceOf[js.Any])
      
      inline def setSchedulingUndefined: Self = StObject.set(x, "scheduling", js.undefined)
      
      inline def setSecureContext(value: SecureContext): Self = StObject.set(x, "secureContext", value.asInstanceOf[js.Any])
      
      inline def setSecureContextUndefined: Self = StObject.set(x, "secureContext", js.undefined)
      
      inline def setSecureOptions(value: Double): Self = StObject.set(x, "secureOptions", value.asInstanceOf[js.Any])
      
      inline def setSecureOptionsUndefined: Self = StObject.set(x, "secureOptions", js.undefined)
      
      inline def setSecureProtocol(value: String): Self = StObject.set(x, "secureProtocol", value.asInstanceOf[js.Any])
      
      inline def setSecureProtocolUndefined: Self = StObject.set(x, "secureProtocol", js.undefined)
      
      inline def setServername(value: String): Self = StObject.set(x, "servername", value.asInstanceOf[js.Any])
      
      inline def setServernameUndefined: Self = StObject.set(x, "servername", js.undefined)
      
      inline def setSession(value: Buffer): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setSessionIdContext(value: String): Self = StObject.set(x, "sessionIdContext", value.asInstanceOf[js.Any])
      
      inline def setSessionIdContextUndefined: Self = StObject.set(x, "sessionIdContext", js.undefined)
      
      inline def setSessionTimeout(value: Double): Self = StObject.set(x, "sessionTimeout", value.asInstanceOf[js.Any])
      
      inline def setSessionTimeoutUndefined: Self = StObject.set(x, "sessionTimeout", js.undefined)
      
      inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      inline def setSigalgs(value: String): Self = StObject.set(x, "sigalgs", value.asInstanceOf[js.Any])
      
      inline def setSigalgsUndefined: Self = StObject.set(x, "sigalgs", js.undefined)
      
      inline def setSocket(value: Duplex): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      inline def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
      
      inline def setTicketKeys(value: Buffer): Self = StObject.set(x, "ticketKeys", value.asInstanceOf[js.Any])
      
      inline def setTicketKeysUndefined: Self = StObject.set(x, "ticketKeys", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  /* Inlined http2-wrapper.http2-wrapper.AgentOptions & {  proxyOptions :http2-wrapper.http2-wrapper.ProxyOptions} */
  trait AgentOptionsproxyOptionsPMaxCachedTlsSessions extends StObject {
    
    var maxCachedTlsSessions: js.UndefOr[Double] = js.undefined
    
    var maxEmptySessions: js.UndefOr[Double] = js.undefined
    
    var maxSessions: js.UndefOr[Double] = js.undefined
    
    var proxyOptions: ProxyOptions
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object AgentOptionsproxyOptionsPMaxCachedTlsSessions {
    
    inline def apply(proxyOptions: ProxyOptions): AgentOptionsproxyOptionsPMaxCachedTlsSessions = {
      val __obj = js.Dynamic.literal(proxyOptions = proxyOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[AgentOptionsproxyOptionsPMaxCachedTlsSessions]
    }
    
    extension [Self <: AgentOptionsproxyOptionsPMaxCachedTlsSessions](x: Self) {
      
      inline def setMaxCachedTlsSessions(value: Double): Self = StObject.set(x, "maxCachedTlsSessions", value.asInstanceOf[js.Any])
      
      inline def setMaxCachedTlsSessionsUndefined: Self = StObject.set(x, "maxCachedTlsSessions", js.undefined)
      
      inline def setMaxEmptySessions(value: Double): Self = StObject.set(x, "maxEmptySessions", value.asInstanceOf[js.Any])
      
      inline def setMaxEmptySessionsUndefined: Self = StObject.set(x, "maxEmptySessions", js.undefined)
      
      inline def setMaxSessions(value: Double): Self = StObject.set(x, "maxSessions", value.asInstanceOf[js.Any])
      
      inline def setMaxSessionsUndefined: Self = StObject.set(x, "maxSessions", js.undefined)
      
      inline def setProxyOptions(value: ProxyOptions): Self = StObject.set(x, "proxyOptions", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait CreateResolveProtocol extends StObject {
    
    def createResolveProtocol(cache: Map[String, String], queue: Map[String, js.Promise[ResolveProtocolResult]]): ResolveProtocolFunction = js.native
    def createResolveProtocol(
      cache: Map[String, String],
      queue: Map[String, js.Promise[ResolveProtocolResult]],
      connect: ResolveProtocolConnectFunction
    ): ResolveProtocolFunction = js.native
    
    var protocolCache: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify QuickLRU<string, string> */ Any = js.native
    
    def resolveProtocol(options: AutoRequestOptions): js.Promise[ResolveProtocolResult] = js.native
    @JSName("resolveProtocol")
    var resolveProtocol_Original: ResolveProtocolFunction = js.native
  }
  
  trait Http extends StObject {
    
    var http: js.UndefOr[Agent | `false`] = js.undefined
    
    var http2: js.UndefOr[typings.http2Wrapper.mod.Agent | `false`] = js.undefined
    
    var https: js.UndefOr[typings.node.httpsMod.Agent | `false`] = js.undefined
  }
  object Http {
    
    inline def apply(): Http = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Http]
    }
    
    extension [Self <: Http](x: Self) {
      
      inline def setHttp(value: Agent | `false`): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
      
      inline def setHttp2(value: typings.http2Wrapper.mod.Agent | `false`): Self = StObject.set(x, "http2", value.asInstanceOf[js.Any])
      
      inline def setHttp2Undefined: Self = StObject.set(x, "http2", js.undefined)
      
      inline def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
      
      inline def setHttps(value: typings.node.httpsMod.Agent | `false`): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      inline def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
    }
  }
}
