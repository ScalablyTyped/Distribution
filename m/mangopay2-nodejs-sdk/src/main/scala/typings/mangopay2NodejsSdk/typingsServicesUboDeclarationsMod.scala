package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.typingsBaseMod.base.MethodOptionWithResponse
import typings.mangopay2NodejsSdk.typingsBaseMod.base.MethodOptionWithoutResponse
import typings.mangopay2NodejsSdk.typingsBaseMod.base.MethodOverload
import typings.mangopay2NodejsSdk.typingsBaseMod.base.ThreeArgsMethodOverload
import typings.mangopay2NodejsSdk.typingsBaseMod.base.TwoArgsMethodOverload
import typings.mangopay2NodejsSdk.typingsBaseMod.base.WithResponse
import typings.mangopay2NodejsSdk.typingsModelsUboDeclarationMod.uboDeclaration.CreateUbo
import typings.mangopay2NodejsSdk.typingsModelsUboDeclarationMod.uboDeclaration.UboData
import typings.mangopay2NodejsSdk.typingsModelsUboDeclarationMod.uboDeclaration.UboDeclarationData
import typings.mangopay2NodejsSdk.typingsModelsUboDeclarationMod.uboDeclaration.UpdateUbo
import typings.mangopay2NodejsSdk.typingsModelsUboDeclarationMod.uboDeclaration.UpdateUboDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsServicesUboDeclarationsMod {
  
  @JSImport("mangopay2-nodejs-sdk/typings/services/UboDeclarations", "UboDeclarations")
  @js.native
  open class UboDeclarations () extends StObject {
    
    /**
      * Create a UBO declaration object from the API
      * @param {String} userId user Unique identifier
      * @param {Object} options
      */
    def create(data: String): js.Promise[UboDeclarationData] = js.native
    /**
      * Create a UBO declaration object from the API
      * @param {String} userId user Unique identifier
      * @param {Object} options
      */
    def create(data: String, callback: js.Function1[/* data */ UboDeclarationData, Unit]): Unit = js.native
    /**
      * Create a UBO declaration object from the API
      * @param {String} userId user Unique identifier
      * @param {Object} options
      */
    def create(
      data: String,
      callback: js.Function1[/* data */ WithResponse[UboDeclarationData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def create(
      data: String,
      callback: js.Function1[/* data */ UboDeclarationData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Create a UBO declaration object from the API
      * @param {String} userId user Unique identifier
      * @param {Object} options
      */
    def create(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[UboDeclarationData]] = js.native
    def create(data: String, options: MethodOptionWithoutResponse): js.Promise[UboDeclarationData] = js.native
    
    /**
      * @param {String} userId User Uniquer identifier
      * @param {String} uboDeclarationId UboDeclaration Uniquer identifier
      * @param {Object} Ubo object
      */
    def createUbo(data: String, extra: String, lastArg: CreateUbo): js.Promise[UboData] = js.native
    /**
      * @param {String} userId User Uniquer identifier
      * @param {String} uboDeclarationId UboDeclaration Uniquer identifier
      * @param {Object} Ubo object
      */
    def createUbo(
      data: String,
      extra: String,
      lastArg: CreateUbo,
      callback: js.Function1[(/* data */ UboData) | (/* data */ WithResponse[UboData]), Unit]
    ): Unit = js.native
    def createUbo(
      data: String,
      extra: String,
      lastArg: CreateUbo,
      callback: js.Function1[/* data */ WithResponse[UboData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def createUbo(
      data: String,
      extra: String,
      lastArg: CreateUbo,
      callback: js.Function1[/* data */ UboData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * @param {String} userId User Uniquer identifier
      * @param {String} uboDeclarationId UboDeclaration Uniquer identifier
      * @param {Object} Ubo object
      */
    def createUbo(data: String, extra: String, lastArg: CreateUbo, options: MethodOptionWithResponse): js.Promise[WithResponse[UboData]] = js.native
    def createUbo(data: String, extra: String, lastArg: CreateUbo, options: MethodOptionWithoutResponse): js.Promise[UboData] = js.native
    /**
      * @param {String} userId User Uniquer identifier
      * @param {String} uboDeclarationId UboDeclaration Uniquer identifier
      * @param {Object} Ubo object
      */
    @JSName("createUbo")
    var createUbo_Original: ThreeArgsMethodOverload[String, String, CreateUbo, UboData] = js.native
    
    /**
      * Create a UBO declaration object from the API
      * @param {String} userId user Unique identifier
      * @param {Object} options
      */
    @JSName("create")
    var create_Original: MethodOverload[String, UboDeclarationData] = js.native
    
    /**
      * Retrieves a UBO declaration object from the API.
      * @param {String} userId User Unique identifier
      * @param {String} id Unique identifier
      * @param {Object} options
      */
    def get(data: String, extra: String): js.Promise[UboDeclarationData] = js.native
    /**
      * Retrieves a UBO declaration object from the API.
      * @param {String} userId User Unique identifier
      * @param {String} id Unique identifier
      * @param {Object} options
      */
    def get(
      data: String,
      extra: String,
      callback: js.Function1[
          (/* data */ UboDeclarationData) | (/* data */ WithResponse[UboDeclarationData]), 
          Unit
        ]
    ): Unit = js.native
    def get(
      data: String,
      extra: String,
      callback: js.Function1[/* data */ WithResponse[UboDeclarationData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def get(
      data: String,
      extra: String,
      callback: js.Function1[/* data */ UboDeclarationData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Retrieves a UBO declaration object from the API.
      * @param {String} userId User Unique identifier
      * @param {String} id Unique identifier
      * @param {Object} options
      */
    def get(data: String, extra: String, options: MethodOptionWithResponse): js.Promise[WithResponse[UboDeclarationData]] = js.native
    def get(data: String, extra: String, options: MethodOptionWithoutResponse): js.Promise[UboDeclarationData] = js.native
    
    /**
      * @param {String} userId user Uniquer identifier
      */
    def getAll(data: String): js.Promise[js.Array[UboDeclarationData]] = js.native
    /**
      * @param {String} userId user Uniquer identifier
      */
    def getAll(data: String, callback: js.Function1[/* data */ js.Array[UboDeclarationData], Unit]): Unit = js.native
    /**
      * @param {String} userId user Uniquer identifier
      */
    def getAll(
      data: String,
      callback: js.Function1[/* data */ WithResponse[js.Array[UboDeclarationData]], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def getAll(
      data: String,
      callback: js.Function1[/* data */ js.Array[UboDeclarationData], Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * @param {String} userId user Uniquer identifier
      */
    def getAll(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[js.Array[UboDeclarationData]]] = js.native
    def getAll(data: String, options: MethodOptionWithoutResponse): js.Promise[js.Array[UboDeclarationData]] = js.native
    /**
      * @param {String} userId user Uniquer identifier
      */
    @JSName("getAll")
    var getAll_Original: MethodOverload[String, js.Array[UboDeclarationData]] = js.native
    
    /**
      * Retrieves a UBO declaration object from the API.
      * @param {String} id Unique identifier
      * @param {Object} options
      */
    def getById(data: String): js.Promise[UboDeclarationData] = js.native
    /**
      * Retrieves a UBO declaration object from the API.
      * @param {String} id Unique identifier
      * @param {Object} options
      */
    def getById(data: String, callback: js.Function1[/* data */ UboDeclarationData, Unit]): Unit = js.native
    /**
      * Retrieves a UBO declaration object from the API.
      * @param {String} id Unique identifier
      * @param {Object} options
      */
    def getById(
      data: String,
      callback: js.Function1[/* data */ WithResponse[UboDeclarationData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def getById(
      data: String,
      callback: js.Function1[/* data */ UboDeclarationData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Retrieves a UBO declaration object from the API.
      * @param {String} id Unique identifier
      * @param {Object} options
      */
    def getById(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[UboDeclarationData]] = js.native
    def getById(data: String, options: MethodOptionWithoutResponse): js.Promise[UboDeclarationData] = js.native
    /**
      * Retrieves a UBO declaration object from the API.
      * @param {String} id Unique identifier
      * @param {Object} options
      */
    @JSName("getById")
    var getById_Original: MethodOverload[String, UboDeclarationData] = js.native
    
    /**
      * @param {String} userId User Uniquer identifier
      * @param {String} uboDeclarationId UboDeclaration Uniquer identifier
      * @param {String} uboId Ubo Uniquer identifier
      */
    def getUbo(data: String, extra: String, lastArg: String): js.Promise[UboData] = js.native
    /**
      * @param {String} userId User Uniquer identifier
      * @param {String} uboDeclarationId UboDeclaration Uniquer identifier
      * @param {String} uboId Ubo Uniquer identifier
      */
    def getUbo(
      data: String,
      extra: String,
      lastArg: String,
      callback: js.Function1[(/* data */ UboData) | (/* data */ WithResponse[UboData]), Unit]
    ): Unit = js.native
    def getUbo(
      data: String,
      extra: String,
      lastArg: String,
      callback: js.Function1[/* data */ WithResponse[UboData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def getUbo(
      data: String,
      extra: String,
      lastArg: String,
      callback: js.Function1[/* data */ UboData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * @param {String} userId User Uniquer identifier
      * @param {String} uboDeclarationId UboDeclaration Uniquer identifier
      * @param {String} uboId Ubo Uniquer identifier
      */
    def getUbo(data: String, extra: String, lastArg: String, options: MethodOptionWithResponse): js.Promise[WithResponse[UboData]] = js.native
    def getUbo(data: String, extra: String, lastArg: String, options: MethodOptionWithoutResponse): js.Promise[UboData] = js.native
    /**
      * @param {String} userId User Uniquer identifier
      * @param {String} uboDeclarationId UboDeclaration Uniquer identifier
      * @param {String} uboId Ubo Uniquer identifier
      */
    @JSName("getUbo")
    var getUbo_Original: ThreeArgsMethodOverload[String, String, String, UboData] = js.native
    
    /**
      * Retrieves a UBO declaration object from the API.
      * @param {String} userId User Unique identifier
      * @param {String} id Unique identifier
      * @param {Object} options
      */
    @JSName("get")
    var get_Original: TwoArgsMethodOverload[String, String, UboDeclarationData] = js.native
    
    /**
      * Updates a UBO declaration entity.
      * @param {String} userId User Unique Identifier
      * @param {Object} uboDeclaration Updated UBO declaration entity - must have ID!
      * @param {Object} options
      */
    def update(data: String, extra: UpdateUboDeclaration): js.Promise[UboDeclarationData] = js.native
    /**
      * Updates a UBO declaration entity.
      * @param {String} userId User Unique Identifier
      * @param {Object} uboDeclaration Updated UBO declaration entity - must have ID!
      * @param {Object} options
      */
    def update(
      data: String,
      extra: UpdateUboDeclaration,
      callback: js.Function1[
          (/* data */ UboDeclarationData) | (/* data */ WithResponse[UboDeclarationData]), 
          Unit
        ]
    ): Unit = js.native
    def update(
      data: String,
      extra: UpdateUboDeclaration,
      callback: js.Function1[/* data */ WithResponse[UboDeclarationData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def update(
      data: String,
      extra: UpdateUboDeclaration,
      callback: js.Function1[/* data */ UboDeclarationData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Updates a UBO declaration entity.
      * @param {String} userId User Unique Identifier
      * @param {Object} uboDeclaration Updated UBO declaration entity - must have ID!
      * @param {Object} options
      */
    def update(data: String, extra: UpdateUboDeclaration, options: MethodOptionWithResponse): js.Promise[WithResponse[UboDeclarationData]] = js.native
    def update(data: String, extra: UpdateUboDeclaration, options: MethodOptionWithoutResponse): js.Promise[UboDeclarationData] = js.native
    
    /**
      * @param {String} userId User Uniquer identifier
      * @param {String} uboDeclarationId UboDeclaration Uniquer identifier
      * @param {Object} Ubo object
      */
    def updateUbo(data: String, extra: String, lastArg: UpdateUbo): js.Promise[UboData] = js.native
    /**
      * @param {String} userId User Uniquer identifier
      * @param {String} uboDeclarationId UboDeclaration Uniquer identifier
      * @param {Object} Ubo object
      */
    def updateUbo(
      data: String,
      extra: String,
      lastArg: UpdateUbo,
      callback: js.Function1[(/* data */ UboData) | (/* data */ WithResponse[UboData]), Unit]
    ): Unit = js.native
    def updateUbo(
      data: String,
      extra: String,
      lastArg: UpdateUbo,
      callback: js.Function1[/* data */ WithResponse[UboData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def updateUbo(
      data: String,
      extra: String,
      lastArg: UpdateUbo,
      callback: js.Function1[/* data */ UboData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * @param {String} userId User Uniquer identifier
      * @param {String} uboDeclarationId UboDeclaration Uniquer identifier
      * @param {Object} Ubo object
      */
    def updateUbo(data: String, extra: String, lastArg: UpdateUbo, options: MethodOptionWithResponse): js.Promise[WithResponse[UboData]] = js.native
    def updateUbo(data: String, extra: String, lastArg: UpdateUbo, options: MethodOptionWithoutResponse): js.Promise[UboData] = js.native
    /**
      * @param {String} userId User Uniquer identifier
      * @param {String} uboDeclarationId UboDeclaration Uniquer identifier
      * @param {Object} Ubo object
      */
    @JSName("updateUbo")
    var updateUbo_Original: ThreeArgsMethodOverload[String, String, UpdateUbo, UboData] = js.native
    
    /**
      * Updates a UBO declaration entity.
      * @param {String} userId User Unique Identifier
      * @param {Object} uboDeclaration Updated UBO declaration entity - must have ID!
      * @param {Object} options
      */
    @JSName("update")
    var update_Original: TwoArgsMethodOverload[String, UpdateUboDeclaration, UboDeclarationData] = js.native
  }
}
