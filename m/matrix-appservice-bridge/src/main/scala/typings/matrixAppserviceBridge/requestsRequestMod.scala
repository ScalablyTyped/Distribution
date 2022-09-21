package typings.matrixAppserviceBridge

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestsRequestMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Logger * / any */ @JSImport("matrix-appservice-bridge/lib/components/requests/request", "Request")
  @js.native
  open class Request[T] protected () extends StObject {
    /**
      * Construct a new Request.
      * @param opts Options for this request.
      * @param opts.id Optional ID to set on this request. One will be
      * generated if this is not provided.
      * @param opts.data Optional data to associate with this request.
      */
    def this(opts: RequestOpts[T]) = this()
    def this(opts: RequestOpts[T], loggerModule: String) = this()
    
    /* private */ var data: Any = js.native
    
    /* private */ var defer: Any = js.native
    
    /**
      * Get any optional data set on this request.
      * @return The data
      */
    def getData(): T = js.native
    
    /**
      * Get the number of elapsed milliseconds since this request was created.
      * @return The number of milliseconds since this request was made.
      */
    def getDuration(): Double = js.native
    
    /**
      * Get this request's ID.
      * @return The ID.
      */
    def getId(): String = js.native
    
    /**
      * Retrieve a promise for this request which will be resolved/rejected when the
      * respective methods are called on this Request.
      * @return {Promise} A promise
      */
    def getPromise(): js.Promise[Any] = js.native
    
    /* private */ var id: Any = js.native
    
    def isPending: Boolean = js.native
    
    /**
      * Resolve or reject the promise depending on the outcome of this promise.
      * @param promise The promise whose resolution determines the outcome of this
      * request.
      */
    def outcomeFrom(promise: js.Promise[Any]): js.Promise[Any] = js.native
    
    /* private */ var pending: Any = js.native
    
    /**
      * Reject a request. This should be invoked for requests which <i>failed to be
      * processed correctly</i>.
      * @param msg The thing to reject with.
      */
    def reject(msg: Any): Unit = js.native
    
    /**
      * Resolve a request. This should be invoked for the <i>successful processing</i>
      * of this request. This doesn't necessarily mean that the request was sent
      * through, e.g. suppressing AS virtual users' messages is still a success.
      * @param msg The thing to resolve with.
      */
    def resolve(msg: Any): Unit = js.native
    
    /* private */ var startTs: Any = js.native
  }
  /* static members */
  object Request {
    
    @JSImport("matrix-appservice-bridge/lib/components/requests/request", "Request")
    @js.native
    val ^ : js.Any = js.native
    
    inline def generateRequestId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateRequestId")().asInstanceOf[String]
  }
  
  trait RequestOpts[T] extends StObject {
    
    var data: T
    
    var id: js.UndefOr[String] = js.undefined
  }
  object RequestOpts {
    
    inline def apply[T](data: T): RequestOpts[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestOpts[T]]
    }
    
    extension [Self <: RequestOpts[?], T](x: Self & RequestOpts[T]) {
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
}
