package typings.instagramPrivateApi

import typings.instagramPrivateApi.anon.FriendlyName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object graphqlRequestOptionsMod {
  
  trait GraphQLRequestOptions extends StObject {
    
    var accessToken: js.UndefOr[String] = js.undefined
    
    var documentId: String
    
    var surface: FriendlyName
    
    var variables: js.Any
  }
  object GraphQLRequestOptions {
    
    @scala.inline
    def apply(documentId: String, surface: FriendlyName, variables: js.Any): GraphQLRequestOptions = {
      val __obj = js.Dynamic.literal(documentId = documentId.asInstanceOf[js.Any], surface = surface.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphQLRequestOptions]
    }
    
    @scala.inline
    implicit class GraphQLRequestOptionsMutableBuilder[Self <: GraphQLRequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
      
      @scala.inline
      def setDocumentId(value: String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSurface(value: FriendlyName): Self = StObject.set(x, "surface", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariables(value: js.Any): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.instagramPrivateApi.instagramPrivateApiStrings.IgInsightsAccountInsightsSurfaceQuery
    - typings.instagramPrivateApi.instagramPrivateApiStrings.IgInsightsAccountInsightsWithTabsQuery
    - typings.instagramPrivateApi.instagramPrivateApiStrings.IgInsightsPostGridSurfaceQuery
    - typings.instagramPrivateApi.instagramPrivateApiStrings.IgInsightsPostInsightsQuery
    - typings.instagramPrivateApi.instagramPrivateApiStrings.IgInsightsStoryInsightsAppQuery
    - java.lang.String
  */
  type InsightsFriendlyName = _InsightsFriendlyName | String
  
  /* Rewritten from type alias, can be one of: 
    - typings.instagramPrivateApi.instagramPrivateApiStrings.account
    - typings.instagramPrivateApi.instagramPrivateApiStrings.post
    - typings.instagramPrivateApi.instagramPrivateApiStrings.story
    - java.lang.String
  */
  type InsightsSurface = _InsightsSurface | String
  
  trait _InsightsFriendlyName extends StObject
  
  trait _InsightsSurface extends StObject
}
