package typings.lesgo

import typings.lesgo.anon.Limit
import typings.lesgo.lesgoBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicesPaginationPaginatorMod {
  
  @JSImport("lesgo/services/pagination/Paginator", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Paginator {
    def this(
      db: typings.lesgo.servicesAuroraDbRDSProxyServiceMod.default,
      sql: String,
      sqlParams: js.Array[Any]
    ) = this()
    def this(db: typings.lesgo.servicesAuroraDbRDSProxyServiceMod.default, sql: String, sqlParams: Any) = this()
    def this(db: typings.lesgo.servicesAuroraDbServiceMod.default, sql: String, sqlParams: js.Array[Any]) = this()
    def this(db: typings.lesgo.servicesAuroraDbServiceMod.default, sql: String, sqlParams: Any) = this()
    def this(
      db: typings.lesgo.servicesAuroraDbRDSProxyServiceMod.default,
      sql: String,
      sqlParams: js.Array[Any],
      options: PaginatorOptions
    ) = this()
    def this(
      db: typings.lesgo.servicesAuroraDbRDSProxyServiceMod.default,
      sql: String,
      sqlParams: Any,
      options: PaginatorOptions
    ) = this()
    def this(
      db: typings.lesgo.servicesAuroraDbServiceMod.default,
      sql: String,
      sqlParams: js.Array[Any],
      options: PaginatorOptions
    ) = this()
    def this(
      db: typings.lesgo.servicesAuroraDbServiceMod.default,
      sql: String,
      sqlParams: Any,
      options: PaginatorOptions
    ) = this()
    
    /* protected */ /* CompleteClass */
    var calculateTotalNumberOfPages: js.Promise[Double] = js.native
    
    /* CompleteClass */
    override def count(): js.Promise[Double] = js.native
    
    /* protected */ /* CompleteClass */
    var countTotalItems: js.Promise[Double] = js.native
    
    /* CompleteClass */
    override def currentPage(): Double = js.native
    
    /* CompleteClass */
    override def executeQuery(): js.Promise[js.Array[Any]] = js.native
    
    /* CompleteClass */
    override def firstItem(): js.Promise[Any] = js.native
    
    /* protected */ /* CompleteClass */
    override def generatePaginationSqlSnippet(): String = js.native
    
    /* protected */ /* CompleteClass */
    override def getLimitAndOffsetByPageAndContentPerPage(): Limit = js.native
    
    /* CompleteClass */
    override def items(): js.Promise[js.Array[Any]] = js.native
    
    /* CompleteClass */
    override def lastItem(): js.Promise[Any] = js.native
    
    /* CompleteClass */
    override def lastPage(): js.Promise[Double] = js.native
    
    /* CompleteClass */
    override def nextPage(): js.Promise[Double | `false`] = js.native
    
    /* CompleteClass */
    override def perPage(): Double = js.native
    
    /* CompleteClass */
    override def previousPage(): Double | `false` = js.native
    
    /* CompleteClass */
    override def toObject(): js.Promise[PaginatorObject[Any]] = js.native
    
    /* CompleteClass */
    override def total(): js.Promise[Double | Null] = js.native
  }
  
  trait Paginator extends StObject {
    
    /* protected */ var calculateTotalNumberOfPages: js.Promise[Double]
    
    def count(): js.Promise[Double]
    
    /* protected */ var countTotalItems: js.Promise[Double]
    
    def currentPage(): Double
    
    def executeQuery(): js.Promise[js.Array[Any]]
    
    def firstItem(): js.Promise[Any]
    
    /* protected */ def generatePaginationSqlSnippet(): String
    
    /* protected */ def getLimitAndOffsetByPageAndContentPerPage(): Limit
    
    def items(): js.Promise[js.Array[Any]]
    
    def lastItem(): js.Promise[Any]
    
    def lastPage(): js.Promise[Double]
    
    def nextPage(): js.Promise[Double | `false`]
    
    def perPage(): Double
    
    def previousPage(): Double | `false`
    
    def toObject(): js.Promise[PaginatorObject[Any]]
    
    def total(): js.Promise[Double | Null]
  }
  object Paginator {
    
    inline def apply(
      calculateTotalNumberOfPages: js.Promise[Double],
      count: () => js.Promise[Double],
      countTotalItems: js.Promise[Double],
      currentPage: () => Double,
      executeQuery: () => js.Promise[js.Array[Any]],
      firstItem: () => js.Promise[Any],
      generatePaginationSqlSnippet: () => String,
      getLimitAndOffsetByPageAndContentPerPage: () => Limit,
      items: () => js.Promise[js.Array[Any]],
      lastItem: () => js.Promise[Any],
      lastPage: () => js.Promise[Double],
      nextPage: () => js.Promise[Double | `false`],
      perPage: () => Double,
      previousPage: () => Double | `false`,
      toObject: () => js.Promise[PaginatorObject[Any]],
      total: () => js.Promise[Double | Null]
    ): Paginator = {
      val __obj = js.Dynamic.literal(calculateTotalNumberOfPages = calculateTotalNumberOfPages.asInstanceOf[js.Any], count = js.Any.fromFunction0(count), countTotalItems = countTotalItems.asInstanceOf[js.Any], currentPage = js.Any.fromFunction0(currentPage), executeQuery = js.Any.fromFunction0(executeQuery), firstItem = js.Any.fromFunction0(firstItem), generatePaginationSqlSnippet = js.Any.fromFunction0(generatePaginationSqlSnippet), getLimitAndOffsetByPageAndContentPerPage = js.Any.fromFunction0(getLimitAndOffsetByPageAndContentPerPage), items = js.Any.fromFunction0(items), lastItem = js.Any.fromFunction0(lastItem), lastPage = js.Any.fromFunction0(lastPage), nextPage = js.Any.fromFunction0(nextPage), perPage = js.Any.fromFunction0(perPage), previousPage = js.Any.fromFunction0(previousPage), toObject = js.Any.fromFunction0(toObject), total = js.Any.fromFunction0(total))
      __obj.asInstanceOf[Paginator]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Paginator] (val x: Self) extends AnyVal {
      
      inline def setCalculateTotalNumberOfPages(value: js.Promise[Double]): Self = StObject.set(x, "calculateTotalNumberOfPages", value.asInstanceOf[js.Any])
      
      inline def setCount(value: () => js.Promise[Double]): Self = StObject.set(x, "count", js.Any.fromFunction0(value))
      
      inline def setCountTotalItems(value: js.Promise[Double]): Self = StObject.set(x, "countTotalItems", value.asInstanceOf[js.Any])
      
      inline def setCurrentPage(value: () => Double): Self = StObject.set(x, "currentPage", js.Any.fromFunction0(value))
      
      inline def setExecuteQuery(value: () => js.Promise[js.Array[Any]]): Self = StObject.set(x, "executeQuery", js.Any.fromFunction0(value))
      
      inline def setFirstItem(value: () => js.Promise[Any]): Self = StObject.set(x, "firstItem", js.Any.fromFunction0(value))
      
      inline def setGeneratePaginationSqlSnippet(value: () => String): Self = StObject.set(x, "generatePaginationSqlSnippet", js.Any.fromFunction0(value))
      
      inline def setGetLimitAndOffsetByPageAndContentPerPage(value: () => Limit): Self = StObject.set(x, "getLimitAndOffsetByPageAndContentPerPage", js.Any.fromFunction0(value))
      
      inline def setItems(value: () => js.Promise[js.Array[Any]]): Self = StObject.set(x, "items", js.Any.fromFunction0(value))
      
      inline def setLastItem(value: () => js.Promise[Any]): Self = StObject.set(x, "lastItem", js.Any.fromFunction0(value))
      
      inline def setLastPage(value: () => js.Promise[Double]): Self = StObject.set(x, "lastPage", js.Any.fromFunction0(value))
      
      inline def setNextPage(value: () => js.Promise[Double | `false`]): Self = StObject.set(x, "nextPage", js.Any.fromFunction0(value))
      
      inline def setPerPage(value: () => Double): Self = StObject.set(x, "perPage", js.Any.fromFunction0(value))
      
      inline def setPreviousPage(value: () => Double | `false`): Self = StObject.set(x, "previousPage", js.Any.fromFunction0(value))
      
      inline def setToObject(value: () => js.Promise[PaginatorObject[Any]]): Self = StObject.set(x, "toObject", js.Any.fromFunction0(value))
      
      inline def setTotal(value: () => js.Promise[Double | Null]): Self = StObject.set(x, "total", js.Any.fromFunction0(value))
    }
  }
  
  trait PaginatorObject[DataT] extends StObject {
    
    var count: Double
    
    var current_page: Double
    
    var items: js.Array[DataT]
    
    var last_page: Double
    
    var next_page: Double | `false`
    
    var per_page: Double
    
    var previous_page: Double | `false`
    
    var total: Double
  }
  object PaginatorObject {
    
    inline def apply[DataT](
      count: Double,
      current_page: Double,
      items: js.Array[DataT],
      last_page: Double,
      next_page: Double | `false`,
      per_page: Double,
      previous_page: Double | `false`,
      total: Double
    ): PaginatorObject[DataT] = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], current_page = current_page.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], last_page = last_page.asInstanceOf[js.Any], next_page = next_page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], previous_page = previous_page.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginatorObject[DataT]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaginatorObject[?], DataT] (val x: Self & PaginatorObject[DataT]) extends AnyVal {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCurrent_page(value: Double): Self = StObject.set(x, "current_page", value.asInstanceOf[js.Any])
      
      inline def setItems(value: js.Array[DataT]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: DataT*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setLast_page(value: Double): Self = StObject.set(x, "last_page", value.asInstanceOf[js.Any])
      
      inline def setNext_page(value: Double | `false`): Self = StObject.set(x, "next_page", value.asInstanceOf[js.Any])
      
      inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
      
      inline def setPrevious_page(value: Double | `false`): Self = StObject.set(x, "previous_page", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait PaginatorOptions extends StObject {
    
    var total: Double
  }
  object PaginatorOptions {
    
    inline def apply(total: Double): PaginatorOptions = {
      val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginatorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaginatorOptions] (val x: Self) extends AnyVal {
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
}
