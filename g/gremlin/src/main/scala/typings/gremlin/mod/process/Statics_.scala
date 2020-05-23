package typings.gremlin.mod.process

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Statics_[T /* <: GraphTraversal */] extends js.Object {
  def V(args: js.Any*): T
  def addE(args: js.Any*): T
  def addV(args: js.Any*): T
  def aggregate(args: js.Any*): T
  def and(args: js.Any*): T
  def as(args: js.Any*): T
  def barrier(args: js.Any*): T
  def both(args: js.Any*): T
  def bothE(args: js.Any*): T
  def bothV(args: js.Any*): T
  def branch(args: js.Any*): T
  def cap(args: js.Any*): T
  def choose(args: js.Any*): T
  def coalesce(args: js.Any*): T
  def coin(args: js.Any*): T
  def constant(args: js.Any*): T
  def count(args: js.Any*): T
  def cyclicPath(args: js.Any*): T
  def dedup(args: js.Any*): T
  def drop(args: js.Any*): T
  def elementMap(args: js.Any*): T
  def emit(args: js.Any*): T
  def filter(args: js.Any*): T
  def flatMap(args: js.Any*): T
  def fold(args: js.Any*): T
  def group(args: js.Any*): T
  def groupCount(args: js.Any*): T
  def has(args: js.Any*): T
  def hasId(args: js.Any*): T
  def hasKey(args: js.Any*): T
  def hasLabel(args: js.Any*): T
  def hasNot(args: js.Any*): T
  def hasValue(args: js.Any*): T
  def id(args: js.Any*): T
  def identity(args: js.Any*): T
  def inE(args: js.Any*): T
  def inV(args: js.Any*): T
  def in_(args: js.Any*): T
  def index(args: js.Any*): T
  def inject(args: js.Any*): T
  def is(args: js.Any*): T
  def key(args: js.Any*): T
  def label(args: js.Any*): T
  def limit(args: js.Any*): T
  def local(args: js.Any*): T
  def loops(args: js.Any*): T
  def map(args: js.Any*): T
  def `match`(args: js.Any*): T
  def math(args: js.Any*): T
  def max(args: js.Any*): T
  def mean(args: js.Any*): T
  def min(args: js.Any*): T
  def not(args: js.Any*): T
  def optional(args: js.Any*): T
  def or(args: js.Any*): T
  def order(args: js.Any*): T
  def otherV(args: js.Any*): T
  def out(args: js.Any*): T
  def outE(args: js.Any*): T
  def outV(args: js.Any*): T
  def path(args: js.Any*): T
  def project(args: js.Any*): T
  def properties(args: js.Any*): T
  def property(args: js.Any*): T
  def propertyMap(args: js.Any*): T
  def range(args: js.Any*): T
  def repeat(args: js.Any*): T
  def sack(args: js.Any*): T
  def sample(args: js.Any*): T
  def select(args: js.Any*): T
  def sideEffect(args: js.Any*): T
  def simplePath(args: js.Any*): T
  def skip(args: js.Any*): T
  def store(args: js.Any*): T
  def subgraph(args: js.Any*): T
  def sum(args: js.Any*): T
  def tail(args: js.Any*): T
  def timeLimit(args: js.Any*): T
  def times(args: js.Any*): T
  def to(args: js.Any*): T
  def toE(args: js.Any*): T
  def toV(args: js.Any*): T
  def tree(args: js.Any*): T
  def unfold(args: js.Any*): T
  def union(args: js.Any*): T
  def until(args: js.Any*): T
  def value(args: js.Any*): T
  def valueMap(args: js.Any*): T
  def values(args: js.Any*): T
  def where(args: js.Any*): T
}

object Statics_ {
  @scala.inline
  def apply[T](
    V: /* repeated */ js.Any => T,
    addE: /* repeated */ js.Any => T,
    addV: /* repeated */ js.Any => T,
    aggregate: /* repeated */ js.Any => T,
    and: /* repeated */ js.Any => T,
    as: /* repeated */ js.Any => T,
    barrier: /* repeated */ js.Any => T,
    both: /* repeated */ js.Any => T,
    bothE: /* repeated */ js.Any => T,
    bothV: /* repeated */ js.Any => T,
    branch: /* repeated */ js.Any => T,
    cap: /* repeated */ js.Any => T,
    choose: /* repeated */ js.Any => T,
    coalesce: /* repeated */ js.Any => T,
    coin: /* repeated */ js.Any => T,
    constant: /* repeated */ js.Any => T,
    count: /* repeated */ js.Any => T,
    cyclicPath: /* repeated */ js.Any => T,
    dedup: /* repeated */ js.Any => T,
    drop: /* repeated */ js.Any => T,
    elementMap: /* repeated */ js.Any => T,
    emit: /* repeated */ js.Any => T,
    filter: /* repeated */ js.Any => T,
    flatMap: /* repeated */ js.Any => T,
    fold: /* repeated */ js.Any => T,
    group: /* repeated */ js.Any => T,
    groupCount: /* repeated */ js.Any => T,
    has: /* repeated */ js.Any => T,
    hasId: /* repeated */ js.Any => T,
    hasKey: /* repeated */ js.Any => T,
    hasLabel: /* repeated */ js.Any => T,
    hasNot: /* repeated */ js.Any => T,
    hasValue: /* repeated */ js.Any => T,
    id: /* repeated */ js.Any => T,
    identity: /* repeated */ js.Any => T,
    inE: /* repeated */ js.Any => T,
    inV: /* repeated */ js.Any => T,
    in_ : /* repeated */ js.Any => T,
    index: /* repeated */ js.Any => T,
    inject: /* repeated */ js.Any => T,
    is: /* repeated */ js.Any => T,
    key: /* repeated */ js.Any => T,
    label: /* repeated */ js.Any => T,
    limit: /* repeated */ js.Any => T,
    local: /* repeated */ js.Any => T,
    loops: /* repeated */ js.Any => T,
    map: /* repeated */ js.Any => T,
    `match`: /* repeated */ js.Any => T,
    math: /* repeated */ js.Any => T,
    max: /* repeated */ js.Any => T,
    mean: /* repeated */ js.Any => T,
    min: /* repeated */ js.Any => T,
    not: /* repeated */ js.Any => T,
    optional: /* repeated */ js.Any => T,
    or: /* repeated */ js.Any => T,
    order: /* repeated */ js.Any => T,
    otherV: /* repeated */ js.Any => T,
    out: /* repeated */ js.Any => T,
    outE: /* repeated */ js.Any => T,
    outV: /* repeated */ js.Any => T,
    path: /* repeated */ js.Any => T,
    project: /* repeated */ js.Any => T,
    properties: /* repeated */ js.Any => T,
    property: /* repeated */ js.Any => T,
    propertyMap: /* repeated */ js.Any => T,
    range: /* repeated */ js.Any => T,
    repeat: /* repeated */ js.Any => T,
    sack: /* repeated */ js.Any => T,
    sample: /* repeated */ js.Any => T,
    select: /* repeated */ js.Any => T,
    sideEffect: /* repeated */ js.Any => T,
    simplePath: /* repeated */ js.Any => T,
    skip: /* repeated */ js.Any => T,
    store: /* repeated */ js.Any => T,
    subgraph: /* repeated */ js.Any => T,
    sum: /* repeated */ js.Any => T,
    tail: /* repeated */ js.Any => T,
    timeLimit: /* repeated */ js.Any => T,
    times: /* repeated */ js.Any => T,
    to: /* repeated */ js.Any => T,
    toE: /* repeated */ js.Any => T,
    toV: /* repeated */ js.Any => T,
    tree: /* repeated */ js.Any => T,
    unfold: /* repeated */ js.Any => T,
    union: /* repeated */ js.Any => T,
    until: /* repeated */ js.Any => T,
    value: /* repeated */ js.Any => T,
    valueMap: /* repeated */ js.Any => T,
    values: /* repeated */ js.Any => T,
    where: /* repeated */ js.Any => T
  ): Statics_[T] = {
    val __obj = js.Dynamic.literal(V = js.Any.fromFunction1(V), addE = js.Any.fromFunction1(addE), addV = js.Any.fromFunction1(addV), aggregate = js.Any.fromFunction1(aggregate), and = js.Any.fromFunction1(and), as = js.Any.fromFunction1(as), barrier = js.Any.fromFunction1(barrier), both = js.Any.fromFunction1(both), bothE = js.Any.fromFunction1(bothE), bothV = js.Any.fromFunction1(bothV), branch = js.Any.fromFunction1(branch), cap = js.Any.fromFunction1(cap), choose = js.Any.fromFunction1(choose), coalesce = js.Any.fromFunction1(coalesce), coin = js.Any.fromFunction1(coin), constant = js.Any.fromFunction1(constant), count = js.Any.fromFunction1(count), cyclicPath = js.Any.fromFunction1(cyclicPath), dedup = js.Any.fromFunction1(dedup), drop = js.Any.fromFunction1(drop), elementMap = js.Any.fromFunction1(elementMap), emit = js.Any.fromFunction1(emit), filter = js.Any.fromFunction1(filter), flatMap = js.Any.fromFunction1(flatMap), fold = js.Any.fromFunction1(fold), group = js.Any.fromFunction1(group), groupCount = js.Any.fromFunction1(groupCount), has = js.Any.fromFunction1(has), hasId = js.Any.fromFunction1(hasId), hasKey = js.Any.fromFunction1(hasKey), hasLabel = js.Any.fromFunction1(hasLabel), hasNot = js.Any.fromFunction1(hasNot), hasValue = js.Any.fromFunction1(hasValue), id = js.Any.fromFunction1(id), identity = js.Any.fromFunction1(identity), inE = js.Any.fromFunction1(inE), inV = js.Any.fromFunction1(inV), in_ = js.Any.fromFunction1(in_), index = js.Any.fromFunction1(index), inject = js.Any.fromFunction1(inject), is = js.Any.fromFunction1(is), key = js.Any.fromFunction1(key), label = js.Any.fromFunction1(label), limit = js.Any.fromFunction1(limit), local = js.Any.fromFunction1(local), loops = js.Any.fromFunction1(loops), map = js.Any.fromFunction1(map), math = js.Any.fromFunction1(math), max = js.Any.fromFunction1(max), mean = js.Any.fromFunction1(mean), min = js.Any.fromFunction1(min), not = js.Any.fromFunction1(not), optional = js.Any.fromFunction1(optional), or = js.Any.fromFunction1(or), order = js.Any.fromFunction1(order), otherV = js.Any.fromFunction1(otherV), out = js.Any.fromFunction1(out), outE = js.Any.fromFunction1(outE), outV = js.Any.fromFunction1(outV), path = js.Any.fromFunction1(path), project = js.Any.fromFunction1(project), properties = js.Any.fromFunction1(properties), property = js.Any.fromFunction1(property), propertyMap = js.Any.fromFunction1(propertyMap), range = js.Any.fromFunction1(range), repeat = js.Any.fromFunction1(repeat), sack = js.Any.fromFunction1(sack), sample = js.Any.fromFunction1(sample), select = js.Any.fromFunction1(select), sideEffect = js.Any.fromFunction1(sideEffect), simplePath = js.Any.fromFunction1(simplePath), skip = js.Any.fromFunction1(skip), store = js.Any.fromFunction1(store), subgraph = js.Any.fromFunction1(subgraph), sum = js.Any.fromFunction1(sum), tail = js.Any.fromFunction1(tail), timeLimit = js.Any.fromFunction1(timeLimit), times = js.Any.fromFunction1(times), to = js.Any.fromFunction1(to), toE = js.Any.fromFunction1(toE), toV = js.Any.fromFunction1(toV), tree = js.Any.fromFunction1(tree), unfold = js.Any.fromFunction1(unfold), union = js.Any.fromFunction1(union), until = js.Any.fromFunction1(until), value = js.Any.fromFunction1(value), valueMap = js.Any.fromFunction1(valueMap), values = js.Any.fromFunction1(values), where = js.Any.fromFunction1(where))
    __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    __obj.asInstanceOf[Statics_[T]]
  }
}

