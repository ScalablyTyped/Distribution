package typings.k6.httpMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.k6.anon.Replace
import typings.k6.httpMod.^
import typings.k6.mod.bytes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def OCSP_REASON_AA_COMPROMISE: /* "aa_compromise" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("OCSP_REASON_AA_COMPROMISE").asInstanceOf[/* "aa_compromise" */ String]

inline def OCSP_REASON_AFFILIATION_CHANGED: /* "affiliation_changed" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("OCSP_REASON_AFFILIATION_CHANGED").asInstanceOf[/* "affiliation_changed" */ String]

inline def OCSP_REASON_CA_COMPROMISE: /* "ca_compromise" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("OCSP_REASON_CA_COMPROMISE").asInstanceOf[/* "ca_compromise" */ String]

inline def OCSP_REASON_CERTIFICATE_HOLD: /* "certificate_hold" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("OCSP_REASON_CERTIFICATE_HOLD").asInstanceOf[/* "certificate_hold" */ String]

inline def OCSP_REASON_CESSATION_OF_OPERATION: /* "cessation_of_operation" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("OCSP_REASON_CESSATION_OF_OPERATION").asInstanceOf[/* "cessation_of_operation" */ String]

inline def OCSP_REASON_KEY_COMPROMISE: /* "key_compromise" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("OCSP_REASON_KEY_COMPROMISE").asInstanceOf[/* "key_compromise" */ String]

inline def OCSP_REASON_PRIVILEGE_WITHDRAWN: /* "privilege_withdrawn" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("OCSP_REASON_PRIVILEGE_WITHDRAWN").asInstanceOf[/* "privilege_withdrawn" */ String]

inline def OCSP_REASON_REMOVE_FROM_CRL: /* "remove_from_crl" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("OCSP_REASON_REMOVE_FROM_CRL").asInstanceOf[/* "remove_from_crl" */ String]

inline def OCSP_REASON_SUPERSEDED: /* "superseded" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("OCSP_REASON_SUPERSEDED").asInstanceOf[/* "superseded" */ String]

inline def OCSP_REASON_UNSPECIFIED: /* "unspecified" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("OCSP_REASON_UNSPECIFIED").asInstanceOf[/* "unspecified" */ String]

inline def OCSP_STATUS_GOOD: /* "good" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("OCSP_STATUS_GOOD").asInstanceOf[/* "good" */ String]

inline def OCSP_STATUS_REVOKED: /* "revoked" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("OCSP_STATUS_REVOKED").asInstanceOf[/* "revoked" */ String]

inline def OCSP_STATUS_SERVER_FAILED: /* "server_failed" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("OCSP_STATUS_SERVER_FAILED").asInstanceOf[/* "server_failed" */ String]

inline def OCSP_STATUS_UNKNOWN: /* "unknown" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("OCSP_STATUS_UNKNOWN").asInstanceOf[/* "unknown" */ String]

inline def SSL_3_0: /* "ssl3.0" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("SSL_3_0").asInstanceOf[/* "ssl3.0" */ String]

inline def TLS_1_0: /* "tls1.0" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("TLS_1_0").asInstanceOf[/* "tls1.0" */ String]

inline def TLS_1_1: /* "tls1.1" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("TLS_1_1").asInstanceOf[/* "tls1.1" */ String]

inline def TLS_1_2: /* "tls1.2" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("TLS_1_2").asInstanceOf[/* "tls1.2" */ String]

inline def TLS_1_3: /* "tls1.3" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("TLS_1_3").asInstanceOf[/* "tls1.3" */ String]

inline def batch[Q /* <: BatchRequests */](requests: Q): BatchResponses[Q] = ^.asInstanceOf[js.Dynamic].applyDynamic("batch")(requests.asInstanceOf[js.Any]).asInstanceOf[BatchResponses[Q]]

inline def cookieJar(): CookieJar_ = ^.asInstanceOf[js.Dynamic].applyDynamic("cookieJar")().asInstanceOf[CookieJar_]

inline def del[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = ^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any]).asInstanceOf[RefinedResponse[RT]]
inline def del[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def del[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Unit, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def del[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def del[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def del[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL): RefinedResponse[RT] = ^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any]).asInstanceOf[RefinedResponse[RT]]
inline def del[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def del[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: Unit, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def del[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: RequestBody): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def del[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]

inline def expectedStatuses(param: (Double | ExpectedStatusesObject)*): ExpectedStatusesCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("expectedStatuses")(param.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ExpectedStatusesCallback]

inline def file(data: String): FileData = ^.asInstanceOf[js.Dynamic].applyDynamic("file")(data.asInstanceOf[js.Any]).asInstanceOf[FileData]
inline def file(data: String, filename: String): FileData = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[FileData]
inline def file(data: String, filename: String, contentType: String): FileData = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[FileData]
inline def file(data: String, filename: Unit, contentType: String): FileData = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[FileData]
inline def file(data: js.typedarray.ArrayBuffer): FileData = ^.asInstanceOf[js.Dynamic].applyDynamic("file")(data.asInstanceOf[js.Any]).asInstanceOf[FileData]
inline def file(data: js.typedarray.ArrayBuffer, filename: String): FileData = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[FileData]
inline def file(data: js.typedarray.ArrayBuffer, filename: String, contentType: String): FileData = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[FileData]
inline def file(data: js.typedarray.ArrayBuffer, filename: Unit, contentType: String): FileData = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[FileData]
inline def file(data: bytes): FileData = ^.asInstanceOf[js.Dynamic].applyDynamic("file")(data.asInstanceOf[js.Any]).asInstanceOf[FileData]
inline def file(data: bytes, filename: String): FileData = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[FileData]
inline def file(data: bytes, filename: String, contentType: String): FileData = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[FileData]
inline def file(data: bytes, filename: Unit, contentType: String): FileData = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[FileData]

inline def get[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any]).asInstanceOf[RefinedResponse[RT]]
inline def get[RT /* <: js.UndefOr[ResponseType] */](url: String, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def get[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL): RefinedResponse[RT] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any]).asInstanceOf[RefinedResponse[RT]]
inline def get[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]

inline def head[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = ^.asInstanceOf[js.Dynamic].applyDynamic("head")(url.asInstanceOf[js.Any]).asInstanceOf[RefinedResponse[RT]]
inline def head[RT /* <: js.UndefOr[ResponseType] */](url: String, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("head")(url.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def head[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL): RefinedResponse[RT] = ^.asInstanceOf[js.Dynamic].applyDynamic("head")(url.asInstanceOf[js.Any]).asInstanceOf[RefinedResponse[RT]]
inline def head[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("head")(url.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]

inline def options[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = ^.asInstanceOf[js.Dynamic].applyDynamic("options")(url.asInstanceOf[js.Any]).asInstanceOf[RefinedResponse[RT]]
inline def options[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("options")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def options[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Unit, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("options")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def options[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("options")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def options[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("options")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def options[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL): RefinedResponse[RT] = ^.asInstanceOf[js.Dynamic].applyDynamic("options")(url.asInstanceOf[js.Any]).asInstanceOf[RefinedResponse[RT]]
inline def options[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("options")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def options[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: Unit, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("options")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def options[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: RequestBody): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("options")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def options[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("options")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]

inline def patch[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = ^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any]).asInstanceOf[RefinedResponse[RT]]
inline def patch[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def patch[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Unit, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def patch[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def patch[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def patch[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL): RefinedResponse[RT] = ^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any]).asInstanceOf[RefinedResponse[RT]]
inline def patch[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def patch[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: Unit, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def patch[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: RequestBody): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def patch[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]

inline def post[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = ^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any]).asInstanceOf[RefinedResponse[RT]]
inline def post[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def post[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Unit, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def post[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def post[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def post[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL): RefinedResponse[RT] = ^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any]).asInstanceOf[RefinedResponse[RT]]
inline def post[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def post[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: Unit, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def post[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: RequestBody): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def post[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]

inline def put[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = ^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any]).asInstanceOf[RefinedResponse[RT]]
inline def put[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def put[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Unit, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def put[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def put[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def put[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL): RefinedResponse[RT] = ^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any]).asInstanceOf[RefinedResponse[RT]]
inline def put[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def put[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: Unit, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def put[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: RequestBody): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def put[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]

inline def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: String): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: String, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: String, body: Unit, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: String, body: RequestBody): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: HttpURL): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: HttpURL, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: HttpURL, body: Unit, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: HttpURL, body: RequestBody): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
inline def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: HttpURL, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]

inline def setResponseCallback(responseCallback: ExpectedStatusesCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setResponseCallback")(responseCallback.asInstanceOf[js.Any]).asInstanceOf[Unit]

type ArrayBatchRequest = js.Tuple4[String, String | HttpURL, js.UndefOr[RequestBody | Null], js.UndefOr[Params | Null]]

type ArrayRefinedBatchRequest[RT /* <: js.UndefOr[ResponseType] */] = js.Tuple4[
String, 
String | HttpURL, 
js.UndefOr[RequestBody | Null], 
js.UndefOr[RefinedParams[RT] | Null]]

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typings.k6.httpMod.HttpURL
  - typings.k6.httpMod.ArrayBatchRequest
  - typings.k6.httpMod.ObjectBatchRequest
*/
type BatchRequest = _BatchRequest | String | ArrayBatchRequest

type BatchRequests = js.Array[BatchRequest] | StringDictionary[BatchRequest]

type BatchResponses[Q] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof Q ]: Q[K] extends k6.k6/http.RefinedBatchRequest<infer RT>? k6.k6/http.RefinedResponse<any> : never}
  */ typings.k6.k6Strings.BatchResponses & TopLevel[Q]

type CookieJarCookies = StringDictionary[js.Array[String]]

type ExpectedStatusesCallback = StringDictionary[scala.Nothing]

type ParamsCookieValue = String | Replace

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typings.k6.httpMod.HttpURL
  - typings.k6.httpMod.ArrayRefinedBatchRequest[RT]
  - typings.k6.httpMod.ObjectRefinedBatchRequest[RT]
*/
type RefinedBatchRequest[RT /* <: js.UndefOr[ResponseType] */] = _RefinedBatchRequest[RT] | String | ArrayRefinedBatchRequest[RT]

type RefinedResponseBody[RT /* <: js.UndefOr[ResponseType] */] = String | Null | bytes

type RequestBody = String | StructuredRequestBody | js.typedarray.ArrayBuffer

type ResponseBody = String | bytes | Null

type StructuredRequestBody = StringDictionary[String | FileData]
