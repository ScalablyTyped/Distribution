package typings.libnpmsearch

import typings.libnpmsearch.anon.Maintenance
import typings.libnpmsearch.anon.Optionsdetailedtrue
import typings.libnpmsearch.libnpmsearchStrings.maintenance
import typings.libnpmsearch.libnpmsearchStrings.optimal
import typings.libnpmsearch.libnpmsearchStrings.popularity
import typings.libnpmsearch.libnpmsearchStrings.quality
import typings.node.NodeJS.ReadWriteStream
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(query: String): js.Promise[js.Array[Result]] = ^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Result]]]
  @scala.inline
  def apply(query: String, opts: Optionsdetailedtrue): js.Promise[js.Array[DetailedResult]] = (^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[DetailedResult]]]
  @scala.inline
  def apply(query: String, opts: Options): js.Promise[js.Array[Result]] = (^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Result]]]
  @scala.inline
  def apply(query: js.Array[String]): js.Promise[js.Array[Result]] = ^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Result]]]
  @scala.inline
  def apply(query: js.Array[String], opts: Optionsdetailedtrue): js.Promise[js.Array[DetailedResult]] = (^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[DetailedResult]]]
  @scala.inline
  def apply(query: js.Array[String], opts: Options): js.Promise[js.Array[Result]] = (^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Result]]]
  
  @JSImport("libnpmsearch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def stream(query: String): ReadWriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("stream")(query.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  @scala.inline
  def stream(query: String, opts: Options): ReadWriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(query.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  @scala.inline
  def stream(query: js.Array[String]): ReadWriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("stream")(query.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  @scala.inline
  def stream(query: js.Array[String], opts: Options): ReadWriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(query.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  
  trait DetailedResult extends StObject {
    
    @JSName("package")
    var _package: Result
    
    var score: Score
    
    var searchScore: Double
  }
  object DetailedResult {
    
    @scala.inline
    def apply(_package: Result, score: Score, searchScore: Double): DetailedResult = {
      val __obj = js.Dynamic.literal(score = score.asInstanceOf[js.Any], searchScore = searchScore.asInstanceOf[js.Any])
      __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetailedResult]
    }
    
    @scala.inline
    implicit class DetailedResultMutableBuilder[Self <: DetailedResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScore(value: Score): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchScore(value: Double): Self = StObject.set(x, "searchScore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_package(value: Result): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    }
  }
  
  trait Maintainer extends StObject {
    
    var email: String
    
    var username: String
  }
  object Maintainer {
    
    @scala.inline
    def apply(email: String, username: String): Maintainer = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Maintainer]
    }
    
    @scala.inline
    implicit class MaintainerMutableBuilder[Self <: Maintainer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options
    extends StObject
       with SearchOptions
       with typings.npmRegistryFetch.mod.Options
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
  }
  
  trait Result extends StObject {
    
    var date: js.UndefOr[Date] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var keywords: js.UndefOr[js.Array[String]] = js.undefined
    
    var maintainers: js.UndefOr[js.Array[Maintainer]] = js.undefined
    
    var name: String
    
    var version: String
  }
  object Result {
    
    @scala.inline
    def apply(name: String, version: String): Result = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      @scala.inline
      def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value :_*))
      
      @scala.inline
      def setMaintainers(value: js.Array[Maintainer]): Self = StObject.set(x, "maintainers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaintainersUndefined: Self = StObject.set(x, "maintainers", js.undefined)
      
      @scala.inline
      def setMaintainersVarargs(value: Maintainer*): Self = StObject.set(x, "maintainers", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait Score extends StObject {
    
    var detail: Maintenance
    
    var `final`: Double
  }
  object Score {
    
    @scala.inline
    def apply(detail: Maintenance, `final`: Double): Score = {
      val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any])
      __obj.updateDynamic("final")(`final`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Score]
    }
    
    @scala.inline
    implicit class ScoreMutableBuilder[Self <: Score] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetail(value: Maintenance): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinal(value: Double): Self = StObject.set(x, "final", value.asInstanceOf[js.Any])
    }
  }
  
  trait SearchOptions extends StObject {
    
    /**
      * If true, returns an object with `package`, `score`, and `searchScore`
      * fields, with `package` being what would usually be returned, and the
      * other two containing details about how that package scored. Useful
      * for UIs. Default: `false`
      */
    var detailed: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Offset number for results. Used with `opts.limit` for pagination.
      * Default: `0`
      */
    var from: js.UndefOr[Double] = js.undefined
    
    /**
      * Number of results to limit the query to. Default: `20`
      */
    var limit: js.UndefOr[Double] = js.undefined
    
    /**
      * Decimal number between `0` and `1` that defines the weight of
      * `maintenance` metrics when scoring and sorting packages.
      * Default: `0.65` (same as `opts.sortBy: 'optimal'`)
      */
    var maintenance: js.UndefOr[Double] = js.undefined
    
    /**
      * Decimal number between `0` and `1` that defines the weight of
      * `popularity` metrics when scoring and sorting packages.
      * Default: `0.98` (same as `opts.sortBy: 'optimal'`)
      */
    var popularity: js.UndefOr[Double] = js.undefined
    
    /**
      * Decimal number between `0` and `1` that defines the weight of
      * `quality` metrics when scoring and sorting packages.
      * Default: `0.5` (same as `opts.sortBy: 'optimal'`)
      */
    var quality: js.UndefOr[Double] = js.undefined
    
    /**
      * Used as a shorthand to set `opts.quality`, `opts.maintenance`, and
      * `opts.popularity` with values that prioritize each one.
      */
    var sortBy: js.UndefOr[optimal | quality | maintenance | popularity] = js.undefined
  }
  object SearchOptions {
    
    @scala.inline
    def apply(): SearchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchOptions]
    }
    
    @scala.inline
    implicit class SearchOptionsMutableBuilder[Self <: SearchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetailed(value: Boolean): Self = StObject.set(x, "detailed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailedUndefined: Self = StObject.set(x, "detailed", js.undefined)
      
      @scala.inline
      def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setMaintenance(value: Double): Self = StObject.set(x, "maintenance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaintenanceUndefined: Self = StObject.set(x, "maintenance", js.undefined)
      
      @scala.inline
      def setPopularity(value: Double): Self = StObject.set(x, "popularity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopularityUndefined: Self = StObject.set(x, "popularity", js.undefined)
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      @scala.inline
      def setSortBy(value: optimal | quality | maintenance | popularity): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
    }
  }
}
