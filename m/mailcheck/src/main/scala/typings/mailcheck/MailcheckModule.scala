package typings.mailcheck

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MailcheckModule {
  
  @js.native
  trait IAsynchronousOptions extends StObject {
    
    var distanceFunction: js.UndefOr[IDistanceFunction] = js.native
    
    var domains: js.UndefOr[js.Array[String]] = js.native
    
    var email: String = js.native
    
    var empty: js.UndefOr[IEmpty | IJQueryEmpty] = js.native
    
    var secondLevelDomains: js.UndefOr[js.Array[String]] = js.native
    
    var suggested: ISuggested | IJQuerySuggested = js.native
    
    var topLevelDomains: js.UndefOr[js.Array[String]] = js.native
  }
  object IAsynchronousOptions {
    
    @scala.inline
    def apply(email: String, suggested: ISuggested | IJQuerySuggested): IAsynchronousOptions = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], suggested = suggested.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAsynchronousOptions]
    }
    
    @scala.inline
    implicit class IAsynchronousOptionsMutableBuilder[Self <: IAsynchronousOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDistanceFunction(value: (/* s1 */ String, /* s2 */ String) => Double): Self = StObject.set(x, "distanceFunction", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDistanceFunctionUndefined: Self = StObject.set(x, "distanceFunction", js.undefined)
      
      @scala.inline
      def setDomains(value: js.Array[String]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainsUndefined: Self = StObject.set(x, "domains", js.undefined)
      
      @scala.inline
      def setDomainsVarargs(value: String*): Self = StObject.set(x, "domains", js.Array(value :_*))
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmpty(value: IEmpty | IJQueryEmpty): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyFunction0(value: () => Unit): Self = StObject.set(x, "empty", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEmptyFunction1(value: /* element */ JQuery => Unit): Self = StObject.set(x, "empty", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
      
      @scala.inline
      def setSecondLevelDomains(value: js.Array[String]): Self = StObject.set(x, "secondLevelDomains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondLevelDomainsUndefined: Self = StObject.set(x, "secondLevelDomains", js.undefined)
      
      @scala.inline
      def setSecondLevelDomainsVarargs(value: String*): Self = StObject.set(x, "secondLevelDomains", js.Array(value :_*))
      
      @scala.inline
      def setSuggested(value: ISuggested | IJQuerySuggested): Self = StObject.set(x, "suggested", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestedFunction1(value: /* suggested */ ISuggestion => Unit): Self = StObject.set(x, "suggested", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSuggestedFunction2(value: (/* element */ JQuery, /* suggested */ ISuggestion) => Unit): Self = StObject.set(x, "suggested", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTopLevelDomains(value: js.Array[String]): Self = StObject.set(x, "topLevelDomains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopLevelDomainsUndefined: Self = StObject.set(x, "topLevelDomains", js.undefined)
      
      @scala.inline
      def setTopLevelDomainsVarargs(value: String*): Self = StObject.set(x, "topLevelDomains", js.Array(value :_*))
    }
  }
  
  type IDistanceFunction = js.Function2[/* s1 */ String, /* s2 */ String, Double]
  
  type IEmpty = js.Function0[Unit]
  
  type IJQueryEmpty = js.Function1[/* element */ JQuery, Unit]
  
  type IJQuerySuggested = js.Function2[/* element */ JQuery, /* suggested */ ISuggestion, Unit]
  
  @js.native
  trait ISplitEmail extends StObject {
    
    var address: js.UndefOr[String] = js.native
    
    var domain: js.UndefOr[String] = js.native
    
    var topLevelDomain: js.UndefOr[String] = js.native
  }
  object ISplitEmail {
    
    @scala.inline
    def apply(): ISplitEmail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISplitEmail]
    }
    
    @scala.inline
    implicit class ISplitEmailMutableBuilder[Self <: ISplitEmail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setTopLevelDomain(value: String): Self = StObject.set(x, "topLevelDomain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopLevelDomainUndefined: Self = StObject.set(x, "topLevelDomain", js.undefined)
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
  
  @js.native
  trait ISuggestion extends StObject {
    
    var address: String = js.native
    
    var domain: String = js.native
    
    var full: String = js.native
  }
  object ISuggestion {
    
    @scala.inline
    def apply(address: String, domain: String, full: String): ISuggestion = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], full = full.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISuggestion]
    }
    
    @scala.inline
    implicit class ISuggestionMutableBuilder[Self <: ISuggestion] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFull(value: String): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ISynchronousOptions extends StObject {
    
    var distanceFunction: js.UndefOr[IDistanceFunction] = js.native
    
    var domains: js.UndefOr[js.Array[String]] = js.native
    
    var email: String = js.native
    
    var secondLevelDomains: js.UndefOr[js.Array[String]] = js.native
    
    var topLevelDomains: js.UndefOr[js.Array[String]] = js.native
  }
  object ISynchronousOptions {
    
    @scala.inline
    def apply(email: String): ISynchronousOptions = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISynchronousOptions]
    }
    
    @scala.inline
    implicit class ISynchronousOptionsMutableBuilder[Self <: ISynchronousOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDistanceFunction(value: (/* s1 */ String, /* s2 */ String) => Double): Self = StObject.set(x, "distanceFunction", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDistanceFunctionUndefined: Self = StObject.set(x, "distanceFunction", js.undefined)
      
      @scala.inline
      def setDomains(value: js.Array[String]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainsUndefined: Self = StObject.set(x, "domains", js.undefined)
      
      @scala.inline
      def setDomainsVarargs(value: String*): Self = StObject.set(x, "domains", js.Array(value :_*))
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondLevelDomains(value: js.Array[String]): Self = StObject.set(x, "secondLevelDomains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondLevelDomainsUndefined: Self = StObject.set(x, "secondLevelDomains", js.undefined)
      
      @scala.inline
      def setSecondLevelDomainsVarargs(value: String*): Self = StObject.set(x, "secondLevelDomains", js.Array(value :_*))
      
      @scala.inline
      def setTopLevelDomains(value: js.Array[String]): Self = StObject.set(x, "topLevelDomains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopLevelDomainsUndefined: Self = StObject.set(x, "topLevelDomains", js.undefined)
      
      @scala.inline
      def setTopLevelDomainsVarargs(value: String*): Self = StObject.set(x, "topLevelDomains", js.Array(value :_*))
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
    def findClosestDomain(
      domain: String,
      domains: js.Array[String],
      distanceFunction: js.UndefOr[scala.Nothing],
      threshold: Double
    ): Boolean | String = js.native
    def findClosestDomain(domain: String, domains: js.Array[String], distanceFunction: IDistanceFunction): Boolean | String = js.native
    def findClosestDomain(domain: String, domains: js.Array[String], distanceFunction: IDistanceFunction, threshold: Double): Boolean | String = js.native
    
    def run(opts: IAsynchronousOptions): Unit = js.native
    def run(opts: ISynchronousOptions): js.UndefOr[ISuggestion] = js.native
    
    def sift3Distance(s1: String, s2: String): Double = js.native
    
    def splitEmail(email: String): ISplitEmail = js.native
    
    def suggest(email: String): Unit = js.native
    def suggest(
      email: String,
      domains: js.UndefOr[scala.Nothing],
      topLevelDomains: js.UndefOr[scala.Nothing],
      distanceFunction: IDistanceFunction
    ): Unit = js.native
    def suggest(email: String, domains: js.UndefOr[scala.Nothing], topLevelDomains: js.Array[String]): Unit = js.native
    def suggest(
      email: String,
      domains: js.UndefOr[scala.Nothing],
      topLevelDomains: js.Array[String],
      distanceFunction: IDistanceFunction
    ): Unit = js.native
    def suggest(email: String, domains: js.Array[String]): Unit = js.native
    def suggest(
      email: String,
      domains: js.Array[String],
      topLevelDomains: js.UndefOr[scala.Nothing],
      distanceFunction: IDistanceFunction
    ): Unit = js.native
    def suggest(email: String, domains: js.Array[String], topLevelDomains: js.Array[String]): Unit = js.native
    def suggest(
      email: String,
      domains: js.Array[String],
      topLevelDomains: js.Array[String],
      distanceFunction: IDistanceFunction
    ): Unit = js.native
    @JSName("suggest")
    var suggest_Original: ISuggestFunction = js.native
    
    var topLevelThreshold: Double = js.native
  }
}
