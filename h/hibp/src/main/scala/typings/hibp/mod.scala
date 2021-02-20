package typings.hibp

import typings.hibp.anon.ApiKey
import typings.hibp.anon.BaseUrl
import typings.hibp.anon.Domain
import typings.hibp.anon.Truncate
import typings.hibp.anon.UserAgent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hibp", "breach")
  @js.native
  def breach(breachName: String): js.Promise[Breach_ | Null] = js.native
  @JSImport("hibp", "breach")
  @js.native
  def breach(breachName: String, options: BaseUrl): js.Promise[Breach_ | Null] = js.native
  
  @JSImport("hibp", "breachedAccount")
  @js.native
  def breachedAccount(account: String): js.Promise[js.Array[Breach_] | Null] = js.native
  @JSImport("hibp", "breachedAccount")
  @js.native
  def breachedAccount(account: String, options: ApiKey): js.Promise[js.Array[Breach_] | Null] = js.native
  
  @JSImport("hibp", "breaches")
  @js.native
  def breaches(): js.Promise[js.Array[Breach_]] = js.native
  @JSImport("hibp", "breaches")
  @js.native
  def breaches(options: Domain): js.Promise[js.Array[Breach_]] = js.native
  
  @JSImport("hibp", "dataClasses")
  @js.native
  def dataClasses(): js.Promise[js.Array[String] | Null] = js.native
  @JSImport("hibp", "dataClasses")
  @js.native
  def dataClasses(options: BaseUrl): js.Promise[js.Array[String] | Null] = js.native
  
  @JSImport("hibp", "pasteAccount")
  @js.native
  def pasteAccount(email: String): js.Promise[js.Array[Paste] | Null] = js.native
  @JSImport("hibp", "pasteAccount")
  @js.native
  def pasteAccount(email: String, options: UserAgent): js.Promise[js.Array[Paste] | Null] = js.native
  
  @JSImport("hibp", "pwnedPassword")
  @js.native
  def pwnedPassword(password: String): js.Promise[Double] = js.native
  @JSImport("hibp", "pwnedPassword")
  @js.native
  def pwnedPassword(password: String, options: BaseUrl): js.Promise[Double] = js.native
  
  @JSImport("hibp", "pwnedPasswordRange")
  @js.native
  def pwnedPasswordRange(prefix: String): js.Promise[js.Array[PwnedPasswordSuffix]] = js.native
  @JSImport("hibp", "pwnedPasswordRange")
  @js.native
  def pwnedPasswordRange(prefix: String, options: BaseUrl): js.Promise[js.Array[PwnedPasswordSuffix]] = js.native
  
  @JSImport("hibp", "search")
  @js.native
  def search(account: String): js.Promise[SearchResults] = js.native
  @JSImport("hibp", "search")
  @js.native
  def search(account: String, breachOptions: Truncate): js.Promise[SearchResults] = js.native
  
  @js.native
  trait Breach_ extends StObject {
    
    var AddedDate: String = js.native
    
    var BreachDate: String = js.native
    
    var DataClasses: js.Array[String] = js.native
    
    var Description: String = js.native
    
    var Domain: String = js.native
    
    var IsFabricated: Boolean = js.native
    
    var IsRetired: Boolean = js.native
    
    var IsSensitive: Boolean = js.native
    
    var IsSpamList: Boolean = js.native
    
    var IsVerified: Boolean = js.native
    
    var LogoPath: String = js.native
    
    var ModifiedDate: String = js.native
    
    var Name: String = js.native
    
    var PwnCount: Double = js.native
    
    var Title: String = js.native
  }
  object Breach_ {
    
    @scala.inline
    def apply(
      AddedDate: String,
      BreachDate: String,
      DataClasses: js.Array[String],
      Description: String,
      Domain: String,
      IsFabricated: Boolean,
      IsRetired: Boolean,
      IsSensitive: Boolean,
      IsSpamList: Boolean,
      IsVerified: Boolean,
      LogoPath: String,
      ModifiedDate: String,
      Name: String,
      PwnCount: Double,
      Title: String
    ): Breach_ = {
      val __obj = js.Dynamic.literal(AddedDate = AddedDate.asInstanceOf[js.Any], BreachDate = BreachDate.asInstanceOf[js.Any], DataClasses = DataClasses.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Domain = Domain.asInstanceOf[js.Any], IsFabricated = IsFabricated.asInstanceOf[js.Any], IsRetired = IsRetired.asInstanceOf[js.Any], IsSensitive = IsSensitive.asInstanceOf[js.Any], IsSpamList = IsSpamList.asInstanceOf[js.Any], IsVerified = IsVerified.asInstanceOf[js.Any], LogoPath = LogoPath.asInstanceOf[js.Any], ModifiedDate = ModifiedDate.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PwnCount = PwnCount.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Breach_]
    }
    
    @scala.inline
    implicit class Breach_MutableBuilder[Self <: Breach_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddedDate(value: String): Self = StObject.set(x, "AddedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreachDate(value: String): Self = StObject.set(x, "BreachDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataClasses(value: js.Array[String]): Self = StObject.set(x, "DataClasses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataClassesVarargs(value: String*): Self = StObject.set(x, "DataClasses", js.Array(value :_*))
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFabricated(value: Boolean): Self = StObject.set(x, "IsFabricated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRetired(value: Boolean): Self = StObject.set(x, "IsRetired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSensitive(value: Boolean): Self = StObject.set(x, "IsSensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSpamList(value: Boolean): Self = StObject.set(x, "IsSpamList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsVerified(value: Boolean): Self = StObject.set(x, "IsVerified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogoPath(value: String): Self = StObject.set(x, "LogoPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiedDate(value: String): Self = StObject.set(x, "ModifiedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPwnCount(value: Double): Self = StObject.set(x, "PwnCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HIBP extends StObject {
    
    def breach(breachName: String): js.Promise[Breach_ | Null] = js.native
    def breach(breachName: String, options: BaseUrl): js.Promise[Breach_ | Null] = js.native
    @JSName("breach")
    var breach_Original: js.Function2[
        /* breachName */ String, 
        /* options */ js.UndefOr[BaseUrl], 
        js.Promise[Breach_ | Null]
      ] = js.native
    
    def breachedAccount(account: String): js.Promise[js.Array[Breach_] | Null] = js.native
    def breachedAccount(account: String, options: ApiKey): js.Promise[js.Array[Breach_] | Null] = js.native
    @JSName("breachedAccount")
    var breachedAccount_Original: js.Function2[
        /* account */ String, 
        /* options */ js.UndefOr[ApiKey], 
        js.Promise[js.Array[Breach_] | Null]
      ] = js.native
    
    def breaches(): js.Promise[js.Array[Breach_]] = js.native
    def breaches(options: Domain): js.Promise[js.Array[Breach_]] = js.native
    @JSName("breaches")
    var breaches_Original: js.Function1[/* options */ js.UndefOr[Domain], js.Promise[js.Array[Breach_]]] = js.native
    
    def dataClasses(): js.Promise[js.Array[String] | Null] = js.native
    def dataClasses(options: BaseUrl): js.Promise[js.Array[String] | Null] = js.native
    @JSName("dataClasses")
    var dataClasses_Original: js.Function1[/* options */ js.UndefOr[BaseUrl], js.Promise[js.Array[String] | Null]] = js.native
    
    def pasteAccount(email: String): js.Promise[js.Array[Paste] | Null] = js.native
    def pasteAccount(email: String, options: UserAgent): js.Promise[js.Array[Paste] | Null] = js.native
    @JSName("pasteAccount")
    var pasteAccount_Original: js.Function2[
        /* email */ String, 
        /* options */ js.UndefOr[UserAgent], 
        js.Promise[js.Array[Paste] | Null]
      ] = js.native
    
    def pwnedPassword(password: String): js.Promise[Double] = js.native
    def pwnedPassword(password: String, options: BaseUrl): js.Promise[Double] = js.native
    
    def pwnedPasswordRange(prefix: String): js.Promise[js.Array[PwnedPasswordSuffix]] = js.native
    def pwnedPasswordRange(prefix: String, options: BaseUrl): js.Promise[js.Array[PwnedPasswordSuffix]] = js.native
    @JSName("pwnedPasswordRange")
    var pwnedPasswordRange_Original: js.Function2[
        /* prefix */ String, 
        /* options */ js.UndefOr[BaseUrl], 
        js.Promise[js.Array[PwnedPasswordSuffix]]
      ] = js.native
    
    @JSName("pwnedPassword")
    var pwnedPassword_Original: js.Function2[/* password */ String, /* options */ js.UndefOr[BaseUrl], js.Promise[Double]] = js.native
    
    def search(account: String): js.Promise[SearchResults] = js.native
    def search(account: String, breachOptions: Truncate): js.Promise[SearchResults] = js.native
    @JSName("search")
    var search_Original: js.Function2[
        /* account */ String, 
        /* breachOptions */ js.UndefOr[Truncate], 
        js.Promise[SearchResults]
      ] = js.native
  }
  
  @js.native
  trait Paste extends StObject {
    
    var Date: String = js.native
    
    var EmailCount: Double = js.native
    
    var Id: String = js.native
    
    var Source: String = js.native
    
    var Title: String = js.native
  }
  object Paste {
    
    @scala.inline
    def apply(Date: String, EmailCount: Double, Id: String, Source: String, Title: String): Paste = {
      val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], EmailCount = EmailCount.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Paste]
    }
    
    @scala.inline
    implicit class PasteMutableBuilder[Self <: Paste] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailCount(value: Double): Self = StObject.set(x, "EmailCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PwnedPasswordSuffix extends StObject {
    
    var count: Double = js.native
    
    var suffix: String = js.native
  }
  object PwnedPasswordSuffix {
    
    @scala.inline
    def apply(count: Double, suffix: String): PwnedPasswordSuffix = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
      __obj.asInstanceOf[PwnedPasswordSuffix]
    }
    
    @scala.inline
    implicit class PwnedPasswordSuffixMutableBuilder[Self <: PwnedPasswordSuffix] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SearchResults extends StObject {
    
    var breaches: js.Array[Breach_] | Null = js.native
    
    var pastes: js.Array[Paste] | Null = js.native
  }
  object SearchResults {
    
    @scala.inline
    def apply(): SearchResults = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchResults]
    }
    
    @scala.inline
    implicit class SearchResultsMutableBuilder[Self <: SearchResults] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreaches(value: js.Array[Breach_]): Self = StObject.set(x, "breaches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreachesNull: Self = StObject.set(x, "breaches", null)
      
      @scala.inline
      def setBreachesVarargs(value: Breach_ *): Self = StObject.set(x, "breaches", js.Array(value :_*))
      
      @scala.inline
      def setPastes(value: js.Array[Paste]): Self = StObject.set(x, "pastes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPastesNull: Self = StObject.set(x, "pastes", null)
      
      @scala.inline
      def setPastesVarargs(value: Paste*): Self = StObject.set(x, "pastes", js.Array(value :_*))
    }
  }
}
