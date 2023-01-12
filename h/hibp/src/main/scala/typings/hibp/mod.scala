package typings.hibp

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import typings.hibp.anon.ApiKey
import typings.hibp.anon.BaseUrl
import typings.hibp.anon.Domain
import typings.hibp.anon.Truncate
import typings.hibp.anon.UserAgent
import typings.std.Error
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hibp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hibp", "RateLimitError")
  @js.native
  open class RateLimitError protected ()
    extends StObject
       with Error {
    def this(
      retryAfter: ReturnType[js.Function1[/* name */ String, String | Null]],
      message: /* import warning: importer.ImportType#apply Failed type conversion: std.Error['constructor']['prototype']['message'] */ js.Any
    ) = this()
    def this(
      retryAfter: ReturnType[js.Function1[/* name */ String, String | Null]],
      message: /* import warning: importer.ImportType#apply Failed type conversion: std.Error['constructor']['prototype']['message'] */ js.Any,
      options: /* import warning: importer.ImportType#apply Failed type conversion: std.Error['constructor']['prototype']['options'] */ js.Any
    ) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * The number of seconds to wait before attempting the request again. May be
      * `undefined` if the API does not provide a `retry-after` header, but this
      * should never happen.
      */
    var retryAfterSeconds: js.UndefOr[Double] = js.native
  }
  
  inline def breach(breachName: String): js.Promise[Breach_ | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("breach")(breachName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Breach_ | Null]]
  inline def breach(breachName: String, options: BaseUrl): js.Promise[Breach_ | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("breach")(breachName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Breach_ | Null]]
  
  inline def breachedAccount(account: String): js.Promise[js.Array[Breach_] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("breachedAccount")(account.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Breach_] | Null]]
  inline def breachedAccount(account: String, options: ApiKey): js.Promise[js.Array[Breach_] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("breachedAccount")(account.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Breach_] | Null]]
  
  inline def breaches(): js.Promise[js.Array[Breach_]] = ^.asInstanceOf[js.Dynamic].applyDynamic("breaches")().asInstanceOf[js.Promise[js.Array[Breach_]]]
  inline def breaches(options: Domain): js.Promise[js.Array[Breach_]] = ^.asInstanceOf[js.Dynamic].applyDynamic("breaches")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Breach_]]]
  
  inline def dataClasses(): js.Promise[js.Array[String] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("dataClasses")().asInstanceOf[js.Promise[js.Array[String] | Null]]
  inline def dataClasses(options: BaseUrl): js.Promise[js.Array[String] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("dataClasses")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String] | Null]]
  
  inline def pasteAccount(email: String): js.Promise[js.Array[Paste] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("pasteAccount")(email.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Paste] | Null]]
  inline def pasteAccount(email: String, options: UserAgent): js.Promise[js.Array[Paste] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("pasteAccount")(email.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Paste] | Null]]
  
  inline def pwnedPassword(password: String): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("pwnedPassword")(password.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  inline def pwnedPassword(password: String, options: BaseUrl): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pwnedPassword")(password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  inline def pwnedPasswordRange(prefix: String): js.Promise[PwnedPasswordSuffixes] = ^.asInstanceOf[js.Dynamic].applyDynamic("pwnedPasswordRange")(prefix.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PwnedPasswordSuffixes]]
  inline def pwnedPasswordRange(prefix: String, options: BaseUrl): js.Promise[PwnedPasswordSuffixes] = (^.asInstanceOf[js.Dynamic].applyDynamic("pwnedPasswordRange")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PwnedPasswordSuffixes]]
  
  inline def search(account: String): js.Promise[SearchResults] = ^.asInstanceOf[js.Dynamic].applyDynamic("search")(account.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SearchResults]]
  inline def search(account: String, breachOptions: Truncate): js.Promise[SearchResults] = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(account.asInstanceOf[js.Any], breachOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchResults]]
  
  trait Breach_ extends StObject {
    
    var AddedDate: String
    
    var BreachDate: String
    
    var DataClasses: js.Array[String]
    
    var Description: String
    
    var Domain: String
    
    var IsFabricated: Boolean
    
    var IsRetired: Boolean
    
    var IsSensitive: Boolean
    
    var IsSpamList: Boolean
    
    var IsVerified: Boolean
    
    var LogoPath: String
    
    var ModifiedDate: String
    
    var Name: String
    
    var PwnCount: Double
    
    var Title: String
  }
  object Breach_ {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: Breach_] (val x: Self) extends AnyVal {
      
      inline def setAddedDate(value: String): Self = StObject.set(x, "AddedDate", value.asInstanceOf[js.Any])
      
      inline def setBreachDate(value: String): Self = StObject.set(x, "BreachDate", value.asInstanceOf[js.Any])
      
      inline def setDataClasses(value: js.Array[String]): Self = StObject.set(x, "DataClasses", value.asInstanceOf[js.Any])
      
      inline def setDataClassesVarargs(value: String*): Self = StObject.set(x, "DataClasses", js.Array(value*))
      
      inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      inline def setDomain(value: String): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
      
      inline def setIsFabricated(value: Boolean): Self = StObject.set(x, "IsFabricated", value.asInstanceOf[js.Any])
      
      inline def setIsRetired(value: Boolean): Self = StObject.set(x, "IsRetired", value.asInstanceOf[js.Any])
      
      inline def setIsSensitive(value: Boolean): Self = StObject.set(x, "IsSensitive", value.asInstanceOf[js.Any])
      
      inline def setIsSpamList(value: Boolean): Self = StObject.set(x, "IsSpamList", value.asInstanceOf[js.Any])
      
      inline def setIsVerified(value: Boolean): Self = StObject.set(x, "IsVerified", value.asInstanceOf[js.Any])
      
      inline def setLogoPath(value: String): Self = StObject.set(x, "LogoPath", value.asInstanceOf[js.Any])
      
      inline def setModifiedDate(value: String): Self = StObject.set(x, "ModifiedDate", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setPwnCount(value: Double): Self = StObject.set(x, "PwnCount", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    }
  }
  
  trait HIBP extends StObject {
    
    var RateLimitError: Instantiable3[
        /* retryAfter */ ReturnType[js.Function1[/* name */ String, String | Null]], 
        /* import warning: importer.ImportType#apply Failed type conversion: std.Error['constructor']['prototype']['message'] */ /* message */ js.Any, 
        /* options */ js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: std.Error['constructor']['prototype']['options'] */ js.Any
        ], 
        typings.hibp.mod.RateLimitError
      ]
    
    def breach(breachName: String): js.Promise[Breach_ | Null]
    def breach(breachName: String, options: BaseUrl): js.Promise[Breach_ | Null]
    @JSName("breach")
    var breach_Original: js.Function2[
        /* breachName */ String, 
        /* options */ js.UndefOr[BaseUrl], 
        js.Promise[Breach_ | Null]
      ]
    
    def breachedAccount(account: String): js.Promise[js.Array[Breach_] | Null]
    def breachedAccount(account: String, options: ApiKey): js.Promise[js.Array[Breach_] | Null]
    @JSName("breachedAccount")
    var breachedAccount_Original: js.Function2[
        /* account */ String, 
        /* options */ js.UndefOr[ApiKey], 
        js.Promise[js.Array[Breach_] | Null]
      ]
    
    def breaches(): js.Promise[js.Array[Breach_]]
    def breaches(options: Domain): js.Promise[js.Array[Breach_]]
    @JSName("breaches")
    var breaches_Original: js.Function1[/* options */ js.UndefOr[Domain], js.Promise[js.Array[Breach_]]]
    
    def dataClasses(): js.Promise[js.Array[String] | Null]
    def dataClasses(options: BaseUrl): js.Promise[js.Array[String] | Null]
    @JSName("dataClasses")
    var dataClasses_Original: js.Function1[/* options */ js.UndefOr[BaseUrl], js.Promise[js.Array[String] | Null]]
    
    def pasteAccount(email: String): js.Promise[js.Array[Paste] | Null]
    def pasteAccount(email: String, options: UserAgent): js.Promise[js.Array[Paste] | Null]
    @JSName("pasteAccount")
    var pasteAccount_Original: js.Function2[
        /* email */ String, 
        /* options */ js.UndefOr[UserAgent], 
        js.Promise[js.Array[Paste] | Null]
      ]
    
    def pwnedPassword(password: String): js.Promise[Double]
    def pwnedPassword(password: String, options: BaseUrl): js.Promise[Double]
    
    def pwnedPasswordRange(prefix: String): js.Promise[PwnedPasswordSuffixes]
    def pwnedPasswordRange(prefix: String, options: BaseUrl): js.Promise[PwnedPasswordSuffixes]
    @JSName("pwnedPasswordRange")
    var pwnedPasswordRange_Original: js.Function2[
        /* prefix */ String, 
        /* options */ js.UndefOr[BaseUrl], 
        js.Promise[PwnedPasswordSuffixes]
      ]
    
    @JSName("pwnedPassword")
    var pwnedPassword_Original: js.Function2[/* password */ String, /* options */ js.UndefOr[BaseUrl], js.Promise[Double]]
    
    def search(account: String): js.Promise[SearchResults]
    def search(account: String, breachOptions: Truncate): js.Promise[SearchResults]
    @JSName("search")
    var search_Original: js.Function2[
        /* account */ String, 
        /* breachOptions */ js.UndefOr[Truncate], 
        js.Promise[SearchResults]
      ]
  }
  object HIBP {
    
    inline def apply(
      RateLimitError: Instantiable3[
          /* retryAfter */ ReturnType[js.Function1[/* name */ String, String | Null]], 
          /* import warning: importer.ImportType#apply Failed type conversion: std.Error['constructor']['prototype']['message'] */ /* message */ js.Any, 
          /* options */ js.UndefOr[
            /* import warning: importer.ImportType#apply Failed type conversion: std.Error['constructor']['prototype']['options'] */ js.Any
          ], 
          RateLimitError
        ],
      breach: (/* breachName */ String, /* options */ js.UndefOr[BaseUrl]) => js.Promise[Breach_ | Null],
      breachedAccount: (/* account */ String, /* options */ js.UndefOr[ApiKey]) => js.Promise[js.Array[Breach_] | Null],
      breaches: /* options */ js.UndefOr[Domain] => js.Promise[js.Array[Breach_]],
      dataClasses: /* options */ js.UndefOr[BaseUrl] => js.Promise[js.Array[String] | Null],
      pasteAccount: (/* email */ String, /* options */ js.UndefOr[UserAgent]) => js.Promise[js.Array[Paste] | Null],
      pwnedPassword: (/* password */ String, /* options */ js.UndefOr[BaseUrl]) => js.Promise[Double],
      pwnedPasswordRange: (/* prefix */ String, /* options */ js.UndefOr[BaseUrl]) => js.Promise[PwnedPasswordSuffixes],
      search: (/* account */ String, /* breachOptions */ js.UndefOr[Truncate]) => js.Promise[SearchResults]
    ): HIBP = {
      val __obj = js.Dynamic.literal(RateLimitError = RateLimitError.asInstanceOf[js.Any], breach = js.Any.fromFunction2(breach), breachedAccount = js.Any.fromFunction2(breachedAccount), breaches = js.Any.fromFunction1(breaches), dataClasses = js.Any.fromFunction1(dataClasses), pasteAccount = js.Any.fromFunction2(pasteAccount), pwnedPassword = js.Any.fromFunction2(pwnedPassword), pwnedPasswordRange = js.Any.fromFunction2(pwnedPasswordRange), search = js.Any.fromFunction2(search))
      __obj.asInstanceOf[HIBP]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HIBP] (val x: Self) extends AnyVal {
      
      inline def setBreach(value: (/* breachName */ String, /* options */ js.UndefOr[BaseUrl]) => js.Promise[Breach_ | Null]): Self = StObject.set(x, "breach", js.Any.fromFunction2(value))
      
      inline def setBreachedAccount(
        value: (/* account */ String, /* options */ js.UndefOr[ApiKey]) => js.Promise[js.Array[Breach_] | Null]
      ): Self = StObject.set(x, "breachedAccount", js.Any.fromFunction2(value))
      
      inline def setBreaches(value: /* options */ js.UndefOr[Domain] => js.Promise[js.Array[Breach_]]): Self = StObject.set(x, "breaches", js.Any.fromFunction1(value))
      
      inline def setDataClasses(value: /* options */ js.UndefOr[BaseUrl] => js.Promise[js.Array[String] | Null]): Self = StObject.set(x, "dataClasses", js.Any.fromFunction1(value))
      
      inline def setPasteAccount(
        value: (/* email */ String, /* options */ js.UndefOr[UserAgent]) => js.Promise[js.Array[Paste] | Null]
      ): Self = StObject.set(x, "pasteAccount", js.Any.fromFunction2(value))
      
      inline def setPwnedPassword(value: (/* password */ String, /* options */ js.UndefOr[BaseUrl]) => js.Promise[Double]): Self = StObject.set(x, "pwnedPassword", js.Any.fromFunction2(value))
      
      inline def setPwnedPasswordRange(
        value: (/* prefix */ String, /* options */ js.UndefOr[BaseUrl]) => js.Promise[PwnedPasswordSuffixes]
      ): Self = StObject.set(x, "pwnedPasswordRange", js.Any.fromFunction2(value))
      
      inline def setRateLimitError(
        value: Instantiable3[
              /* retryAfter */ ReturnType[js.Function1[/* name */ String, String | Null]], 
              /* import warning: importer.ImportType#apply Failed type conversion: std.Error['constructor']['prototype']['message'] */ /* message */ js.Any, 
              /* options */ js.UndefOr[
                /* import warning: importer.ImportType#apply Failed type conversion: std.Error['constructor']['prototype']['options'] */ js.Any
              ], 
              RateLimitError
            ]
      ): Self = StObject.set(x, "RateLimitError", value.asInstanceOf[js.Any])
      
      inline def setSearch(
        value: (/* account */ String, /* breachOptions */ js.UndefOr[Truncate]) => js.Promise[SearchResults]
      ): Self = StObject.set(x, "search", js.Any.fromFunction2(value))
    }
  }
  
  trait Paste extends StObject {
    
    var Date: String
    
    var EmailCount: Double
    
    var Id: String
    
    var Source: String
    
    var Title: String
  }
  object Paste {
    
    inline def apply(Date: String, EmailCount: Double, Id: String, Source: String, Title: String): Paste = {
      val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], EmailCount = EmailCount.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Paste]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Paste] (val x: Self) extends AnyVal {
      
      inline def setDate(value: String): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
      
      inline def setEmailCount(value: Double): Self = StObject.set(x, "EmailCount", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    }
  }
  
  type PwnedPasswordSuffixes = StringDictionary[Double]
  
  trait SearchResults extends StObject {
    
    var breaches: js.Array[Breach_] | Null
    
    var pastes: js.Array[Paste] | Null
  }
  object SearchResults {
    
    inline def apply(): SearchResults = {
      val __obj = js.Dynamic.literal(breaches = null, pastes = null)
      __obj.asInstanceOf[SearchResults]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SearchResults] (val x: Self) extends AnyVal {
      
      inline def setBreaches(value: js.Array[Breach_]): Self = StObject.set(x, "breaches", value.asInstanceOf[js.Any])
      
      inline def setBreachesNull: Self = StObject.set(x, "breaches", null)
      
      inline def setBreachesVarargs(value: Breach_ *): Self = StObject.set(x, "breaches", js.Array(value*))
      
      inline def setPastes(value: js.Array[Paste]): Self = StObject.set(x, "pastes", value.asInstanceOf[js.Any])
      
      inline def setPastesNull: Self = StObject.set(x, "pastes", null)
      
      inline def setPastesVarargs(value: Paste*): Self = StObject.set(x, "pastes", js.Array(value*))
    }
  }
}
