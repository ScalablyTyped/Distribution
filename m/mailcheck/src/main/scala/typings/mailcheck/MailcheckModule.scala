package typings.mailcheck

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MailcheckModule {
  
  trait IAsynchronousOptions extends StObject {
    
    var distanceFunction: js.UndefOr[IDistanceFunction] = js.undefined
    
    var domains: js.UndefOr[js.Array[String]] = js.undefined
    
    var email: String
    
    var empty: js.UndefOr[IEmpty | IJQueryEmpty] = js.undefined
    
    var secondLevelDomains: js.UndefOr[js.Array[String]] = js.undefined
    
    var suggested: ISuggested | IJQuerySuggested
    
    var topLevelDomains: js.UndefOr[js.Array[String]] = js.undefined
  }
  object IAsynchronousOptions {
    
    inline def apply(email: String, suggested: ISuggested | IJQuerySuggested): IAsynchronousOptions = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], suggested = suggested.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAsynchronousOptions]
    }
    
    extension [Self <: IAsynchronousOptions](x: Self) {
      
      inline def setDistanceFunction(value: (/* s1 */ String, /* s2 */ String) => Double): Self = StObject.set(x, "distanceFunction", js.Any.fromFunction2(value))
      
      inline def setDistanceFunctionUndefined: Self = StObject.set(x, "distanceFunction", js.undefined)
      
      inline def setDomains(value: js.Array[String]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
      
      inline def setDomainsUndefined: Self = StObject.set(x, "domains", js.undefined)
      
      inline def setDomainsVarargs(value: String*): Self = StObject.set(x, "domains", js.Array(value :_*))
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmpty(value: IEmpty | IJQueryEmpty): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setEmptyFunction0(value: () => Unit): Self = StObject.set(x, "empty", js.Any.fromFunction0(value))
      
      inline def setEmptyFunction1(value: /* element */ JQuery => Unit): Self = StObject.set(x, "empty", js.Any.fromFunction1(value))
      
      inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
      
      inline def setSecondLevelDomains(value: js.Array[String]): Self = StObject.set(x, "secondLevelDomains", value.asInstanceOf[js.Any])
      
      inline def setSecondLevelDomainsUndefined: Self = StObject.set(x, "secondLevelDomains", js.undefined)
      
      inline def setSecondLevelDomainsVarargs(value: String*): Self = StObject.set(x, "secondLevelDomains", js.Array(value :_*))
      
      inline def setSuggested(value: ISuggested | IJQuerySuggested): Self = StObject.set(x, "suggested", value.asInstanceOf[js.Any])
      
      inline def setSuggestedFunction1(value: /* suggested */ ISuggestion => Unit): Self = StObject.set(x, "suggested", js.Any.fromFunction1(value))
      
      inline def setSuggestedFunction2(value: (/* element */ JQuery, /* suggested */ ISuggestion) => Unit): Self = StObject.set(x, "suggested", js.Any.fromFunction2(value))
      
      inline def setTopLevelDomains(value: js.Array[String]): Self = StObject.set(x, "topLevelDomains", value.asInstanceOf[js.Any])
      
      inline def setTopLevelDomainsUndefined: Self = StObject.set(x, "topLevelDomains", js.undefined)
      
      inline def setTopLevelDomainsVarargs(value: String*): Self = StObject.set(x, "topLevelDomains", js.Array(value :_*))
    }
  }
  
  type IDistanceFunction = js.Function2[/* s1 */ String, /* s2 */ String, Double]
  
  type IEmpty = js.Function0[Unit]
  
  type IJQueryEmpty = js.Function1[/* element */ JQuery, Unit]
  
  type IJQuerySuggested = js.Function2[/* element */ JQuery, /* suggested */ ISuggestion, Unit]
  
  trait ISplitEmail extends StObject {
    
    var address: js.UndefOr[String] = js.undefined
    
    var domain: js.UndefOr[String] = js.undefined
    
    var topLevelDomain: js.UndefOr[String] = js.undefined
  }
  object ISplitEmail {
    
    inline def apply(): ISplitEmail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISplitEmail]
    }
    
    extension [Self <: ISplitEmail](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setTopLevelDomain(value: String): Self = StObject.set(x, "topLevelDomain", value.asInstanceOf[js.Any])
      
      inline def setTopLevelDomainUndefined: Self = StObject.set(x, "topLevelDomain", js.undefined)
    }
  }
  
  type ISuggestFunction = js.Function4[
    /* email */ String, 
    /* domains */ js.UndefOr[js.Array[String]], 
    /* topLevelDomains */ js.UndefOr[js.Array[String]], 
    /* distanceFunction */ js.UndefOr[IDistanceFunction], 
    Unit
  ]
  
  type ISuggested = js.Function1[/* suggested */ ISuggestion, Unit]
  
  trait ISuggestion extends StObject {
    
    var address: String
    
    var domain: String
    
    var full: String
  }
  object ISuggestion {
    
    inline def apply(address: String, domain: String, full: String): ISuggestion = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], full = full.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISuggestion]
    }
    
    extension [Self <: ISuggestion](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setFull(value: String): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISynchronousOptions extends StObject {
    
    var distanceFunction: js.UndefOr[IDistanceFunction] = js.undefined
    
    var domains: js.UndefOr[js.Array[String]] = js.undefined
    
    var email: String
    
    var secondLevelDomains: js.UndefOr[js.Array[String]] = js.undefined
    
    var topLevelDomains: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ISynchronousOptions {
    
    inline def apply(email: String): ISynchronousOptions = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISynchronousOptions]
    }
    
    extension [Self <: ISynchronousOptions](x: Self) {
      
      inline def setDistanceFunction(value: (/* s1 */ String, /* s2 */ String) => Double): Self = StObject.set(x, "distanceFunction", js.Any.fromFunction2(value))
      
      inline def setDistanceFunctionUndefined: Self = StObject.set(x, "distanceFunction", js.undefined)
      
      inline def setDomains(value: js.Array[String]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
      
      inline def setDomainsUndefined: Self = StObject.set(x, "domains", js.undefined)
      
      inline def setDomainsVarargs(value: String*): Self = StObject.set(x, "domains", js.Array(value :_*))
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setSecondLevelDomains(value: js.Array[String]): Self = StObject.set(x, "secondLevelDomains", value.asInstanceOf[js.Any])
      
      inline def setSecondLevelDomainsUndefined: Self = StObject.set(x, "secondLevelDomains", js.undefined)
      
      inline def setSecondLevelDomainsVarargs(value: String*): Self = StObject.set(x, "secondLevelDomains", js.Array(value :_*))
      
      inline def setTopLevelDomains(value: js.Array[String]): Self = StObject.set(x, "topLevelDomains", value.asInstanceOf[js.Any])
      
      inline def setTopLevelDomainsUndefined: Self = StObject.set(x, "topLevelDomains", js.undefined)
      
      inline def setTopLevelDomainsVarargs(value: String*): Self = StObject.set(x, "topLevelDomains", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Static extends StObject {
    
    var defaultDomains: js.Array[String] = js.native
    
    var defaultSecondLevelDomains: js.Array[String] = js.native
    
    var defaultTopLevelDomains: js.Array[String] = js.native
    
    var domainThreshold: Double = js.native
    
    def encodeEmail(email: String): String = js.native
    
    def findClosestDomain(domain: String, domains: js.Array[String]): Boolean | String = js.native
    def findClosestDomain(domain: String, domains: js.Array[String], distanceFunction: Unit, threshold: Double): Boolean | String = js.native
    def findClosestDomain(domain: String, domains: js.Array[String], distanceFunction: IDistanceFunction): Boolean | String = js.native
    def findClosestDomain(domain: String, domains: js.Array[String], distanceFunction: IDistanceFunction, threshold: Double): Boolean | String = js.native
    
    def run(opts: IAsynchronousOptions): Unit = js.native
    def run(opts: ISynchronousOptions): js.UndefOr[ISuggestion] = js.native
    
    def sift3Distance(s1: String, s2: String): Double = js.native
    
    def splitEmail(email: String): ISplitEmail = js.native
    
    def suggest(email: String): Unit = js.native
    def suggest(email: String, domains: js.Array[String]): Unit = js.native
    def suggest(email: String, domains: js.Array[String], topLevelDomains: js.Array[String]): Unit = js.native
    def suggest(
      email: String,
      domains: js.Array[String],
      topLevelDomains: js.Array[String],
      distanceFunction: IDistanceFunction
    ): Unit = js.native
    def suggest(
      email: String,
      domains: js.Array[String],
      topLevelDomains: Unit,
      distanceFunction: IDistanceFunction
    ): Unit = js.native
    def suggest(email: String, domains: Unit, topLevelDomains: js.Array[String]): Unit = js.native
    def suggest(
      email: String,
      domains: Unit,
      topLevelDomains: js.Array[String],
      distanceFunction: IDistanceFunction
    ): Unit = js.native
    def suggest(email: String, domains: Unit, topLevelDomains: Unit, distanceFunction: IDistanceFunction): Unit = js.native
    @JSName("suggest")
    var suggest_Original: ISuggestFunction = js.native
    
    var topLevelThreshold: Double = js.native
  }
}
