package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `TestCase` messages provide the request context and an expectation as to
  * whether the given context will be allowed or denied. Test cases may specify
  * the `request`, `resource`, and `function_mocks` to mock a function call to
  * a service-provided function.  The `request` object represents context
  * present at request-time.  The `resource` is the value of the target
  * resource as it appears in persistent storage before the request is
  * executed.
  */
trait SchemaTestCase extends StObject {
  
  /**
    * Test expectation.
    */
  var expectation: js.UndefOr[String] = js.undefined
  
  /**
    * Optional function mocks for service-defined functions. If not set, any
    * service defined function is expected to return an error, which may or may
    * not influence the test outcome.
    */
  var functionMocks: js.UndefOr[js.Array[SchemaFunctionMock]] = js.undefined
  
  /**
    * Request context.  The exact format of the request context is
    * service-dependent. See the appropriate service documentation for
    * information about the supported fields and types on the request.
    * Minimally, all services support the following fields and types:  Request
    * field  | Type ---------------|----------------- auth.uid       | `string`
    * auth.token     | `map&lt;string, string&gt;` headers        |
    * `map&lt;string, string&gt;` method         | `string` params         |
    * `map&lt;string, string&gt;` path           | `string` time           |
    * `google.protobuf.Timestamp`  If the request value is not well-formed for
    * the service, the request will be rejected as an invalid argument.
    */
  var request: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Optional resource value as it appears in persistent storage before the
    * request is fulfilled.  The resource type depends on the `request.path`
    * value.
    */
  var resource: js.UndefOr[js.Any] = js.undefined
}
object SchemaTestCase {
  
  inline def apply(): SchemaTestCase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestCase]
  }
  
  extension [Self <: SchemaTestCase](x: Self) {
    
    inline def setExpectation(value: String): Self = StObject.set(x, "expectation", value.asInstanceOf[js.Any])
    
    inline def setExpectationUndefined: Self = StObject.set(x, "expectation", js.undefined)
    
    inline def setFunctionMocks(value: js.Array[SchemaFunctionMock]): Self = StObject.set(x, "functionMocks", value.asInstanceOf[js.Any])
    
    inline def setFunctionMocksUndefined: Self = StObject.set(x, "functionMocks", js.undefined)
    
    inline def setFunctionMocksVarargs(value: SchemaFunctionMock*): Self = StObject.set(x, "functionMocks", js.Array(value :_*))
    
    inline def setRequest(value: js.Any): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setResource(value: js.Any): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
