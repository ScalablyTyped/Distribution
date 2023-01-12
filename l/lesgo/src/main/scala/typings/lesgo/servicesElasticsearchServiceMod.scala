package typings.lesgo

import typings.elasticElasticsearch.libClientMod.ClientOptions
import typings.elasticElasticsearch.mod.Client
import typings.lesgo.anon.Id
import typings.lesgo.anon.Profileid
import typings.lesgo.lesgoStrings.aws
import typings.lesgo.lesgoStrings.index
import typings.lesgo.lesgoStrings.wait_for
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import typings.std.Omit
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicesElasticsearchServiceMod {
  
  @JSImport("lesgo/services/ElasticsearchService", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ElasticsearchService {
    def this(params: ElasticsearchServiceParams) = this()
  }
  
  type ConnectionType = aws | String
  
  @js.native
  trait ElasticsearchService extends StObject {
    
    def bulkIndex(bodies: js.Array[RequestBodyWithId[Record[String, Any]]]): js.Promise[Record[String, Any]] = js.native
    
    /* protected */ var client: Client = js.native
    
    /* protected */ def constructBulkIndex(bodies: js.Array[RequestBodyWithId[Record[String, Any]]]): js.Array[Index | (js.Array[RequestBodyWithId[Record[String, Any]]])] = js.native
    
    @JSName("createIndices")
    def createIndices_body(
      settings: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParams.IndicesCreate * / any['body'] */ js.Any
    ): js.Promise[Record[String, Any]] = js.native
    @JSName("createIndices")
    def createIndices_body(
      settings: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParams.IndicesCreate * / any['body'] */ js.Any,
      index: String
    ): js.Promise[Record[String, Any]] = js.native
    @JSName("createIndices")
    def createIndices_body(
      settings: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParams.IndicesCreate * / any['body'] */ js.Any,
      index: js.Array[String]
    ): js.Promise[Record[String, Any]] = js.native
    
    @JSName("create")
    def create_body(
      id: String,
      body: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParams.Index * / any['body'] */ js.Any
    ): js.Promise[Record[String, Any]] = js.native
    
    def deleteIndices(index: String): js.Promise[Record[String, Any]] = js.native
    def deleteIndices(index: js.Array[String]): js.Promise[Record[String, Any]] = js.native
    @JSName("deleteIndices")
    def deleteIndices_index(
      index: String,
      options: Omit[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParams.IndicesDelete */ Any, 
          index
        ]
    ): js.Promise[Record[String, Any]] = js.native
    @JSName("deleteIndices")
    def deleteIndices_index(
      index: js.Array[String],
      options: Omit[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParams.IndicesDelete */ Any, 
          index
        ]
    ): js.Promise[Record[String, Any]] = js.native
    
    // The return here should've been a boolean but the actual code implementation gets for response.body
    def existIndices(index: String): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, any>['body'] */ js.Any
      ] = js.native
    def existIndices(index: js.Array[String]): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, any>['body'] */ js.Any
      ] = js.native
    @JSName("existIndices")
    def existIndices_index(
      index: String,
      options: Omit[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParams.IndicesExists */ Any, 
          index
        ]
    ): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, any>['body'] */ js.Any
      ] = js.native
    @JSName("existIndices")
    def existIndices_index(
      index: js.Array[String],
      options: Omit[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParams.IndicesExists */ Any, 
          index
        ]
    ): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, any>['body'] */ js.Any
      ] = js.native
    
    def get(id: String): js.Promise[Record[String, Any]] = js.native
    
    def getClient(): Client = js.native
    
    var index: String | js.Array[String] = js.native
    
    def indexOrCreateById(
      body: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParams.Index * / any['body'] */ js.Any,
      refresh: wait_for
    ): js.Promise[Record[String, Any]] = js.native
    @JSName("indexOrCreateById")
    def indexOrCreateById_body(
      body: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParams.Index * / any['body'] */ js.Any
    ): js.Promise[Record[String, Any]] = js.native
    @JSName("indexOrCreateById")
    def indexOrCreateById_body(
      body: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParams.Index * / any['body'] */ js.Any,
      refresh: Boolean
    ): js.Promise[Record[String, Any]] = js.native
    
    var options: ClientOptions = js.native
    
    def putMapping(index: String, `type`: String, body: Record[String, Any]): js.Promise[Record[String, Any]] = js.native
    def putMapping(index: js.Array[String], `type`: String, body: Record[String, Any]): js.Promise[Record[String, Any]] = js.native
    
    @JSName("search")
    def search_body(
      body: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParams.Search * / any['body'] */ js.Any
    ): js.Promise[Record[String, Any]] = js.native
    
    def setConnection(): ElasticsearchService = js.native
    def setConnection(conn: ConnectionType): ElasticsearchService = js.native
    
    var `type`: String | js.Array[String] = js.native
    
    def updateById(id: String): js.Promise[Record[String, Any]] = js.native
  }
  
  trait ElasticsearchServiceParams extends StObject {
    
    var connection: ConnectionType
    
    var index: String | js.Array[String]
    
    var options: ClientOptions
    
    var `type`: String | js.Array[String]
  }
  object ElasticsearchServiceParams {
    
    inline def apply(
      connection: ConnectionType,
      index: String | js.Array[String],
      options: ClientOptions,
      `type`: String | js.Array[String]
    ): ElasticsearchServiceParams = {
      val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElasticsearchServiceParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ElasticsearchServiceParams] (val x: Self) extends AnyVal {
      
      inline def setConnection(value: ConnectionType): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: String | js.Array[String]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value*))
      
      inline def setOptions(value: ClientOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setType(value: String | js.Array[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeVarargs(value: String*): Self = StObject.set(x, "type", js.Array(value*))
    }
  }
  
  trait Index extends StObject {
    
    var index: Id
  }
  object Index {
    
    inline def apply(index: Id): Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: Id): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  type ProfileId = String | Double
  
  type RequestBody[T] = T | String | Buffer | Readable
  
  type RequestBodyWithId[T] = T & Profileid
}
