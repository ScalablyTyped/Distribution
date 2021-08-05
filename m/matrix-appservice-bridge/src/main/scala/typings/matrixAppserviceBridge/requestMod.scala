package typings.matrixAppserviceBridge

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestMod {
  
  @JSImport("matrix-appservice-bridge/lib/components/request", "Request")
  @js.native
  class Request[T] protected () extends StObject {
    /**
      * Construct a new Request.
      * @param opts Options for this request.
      * @param opts.id Optional ID to set on this request. One will be
      * generated if this is not provided.
      * @param opts.data Optional data to associate with this request.
      */
    def this(opts: RequestOpts[T]) = this()
    
    /* private */ var data: js.Any = js.native
    
    /* private */ var defer: js.Any = js.native
    
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
    def getPromise(): js.Promise[js.Any] = js.native
    
    /* private */ var id: js.Any = js.native
    
    def isPending: Boolean = js.native
    
    /**
      * Resolve or reject the promise depending on the outcome of this promise.
      * @param promise The promise whose resolution determines the outcome of this
      * request.
      */
    def outcomeFrom(promise: js.Promise[js.Any]): js.Promise[Unit] = js.native
    
    /* private */ var pending: js.Any = js.native
    
    /**
      * Reject a request. This should be invoked for requests which <i>failed to be
      * processed correctly</i>.
      * @param msg The thing to reject with.
      */
    def reject(msg: js.Any): Unit = js.native
    
    /**
      * Resolve a request. This should be invoked for the <i>successful processing</i>
      * of this request. This doesn't necessarily mean that the request was sent
      * through, e.g. suppressing AS virtual users' messages is still a success.
      * @param msg The thing to resolve with.
      */
    def resolve(msg: js.Any): Unit = js.native
    
    /* private */ var startTs: js.Any = js.native
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
