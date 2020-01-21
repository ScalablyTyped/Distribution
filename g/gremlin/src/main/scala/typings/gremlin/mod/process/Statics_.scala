package typings.gremlin.mod.process

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Statics_ extends js.Object {
  def V(args: js.Any*): GraphTraversal
  def addE(args: js.Any*): GraphTraversal
  def addV(args: js.Any*): GraphTraversal
  def aggregate(args: js.Any*): GraphTraversal
  def and(args: js.Any*): GraphTraversal
  def as(args: js.Any*): GraphTraversal
  def barrier(args: js.Any*): GraphTraversal
  def both(args: js.Any*): GraphTraversal
  def bothE(args: js.Any*): GraphTraversal
  def bothV(args: js.Any*): GraphTraversal
  def branch(args: js.Any*): GraphTraversal
  def cap(args: js.Any*): GraphTraversal
  def choose(args: js.Any*): GraphTraversal
  def coalesce(args: js.Any*): GraphTraversal
  def coin(args: js.Any*): GraphTraversal
  def constant(args: js.Any*): GraphTraversal
  def count(args: js.Any*): GraphTraversal
  def cyclicPath(args: js.Any*): GraphTraversal
  def dedup(args: js.Any*): GraphTraversal
  def drop(args: js.Any*): GraphTraversal
  def emit(args: js.Any*): GraphTraversal
  def filter(args: js.Any*): GraphTraversal
  def flatMap(args: js.Any*): GraphTraversal
  def fold(args: js.Any*): GraphTraversal
  def group(args: js.Any*): GraphTraversal
  def groupCount(args: js.Any*): GraphTraversal
  def has(args: js.Any*): GraphTraversal
  def hasId(args: js.Any*): GraphTraversal
  def hasKey(args: js.Any*): GraphTraversal
  def hasLabel(args: js.Any*): GraphTraversal
  def hasNot(args: js.Any*): GraphTraversal
  def hasValue(args: js.Any*): GraphTraversal
  def id(args: js.Any*): GraphTraversal
  def identity(args: js.Any*): GraphTraversal
  def inE(args: js.Any*): GraphTraversal
  def inV(args: js.Any*): GraphTraversal
  def in_(args: js.Any*): GraphTraversal
  def index(args: js.Any*): GraphTraversal
  def inject(args: js.Any*): GraphTraversal
  def is(args: js.Any*): GraphTraversal
  def key(args: js.Any*): GraphTraversal
  def label(args: js.Any*): GraphTraversal
  def limit(args: js.Any*): GraphTraversal
  def local(args: js.Any*): GraphTraversal
  def loops(args: js.Any*): GraphTraversal
  def map(args: js.Any*): GraphTraversal
  def `match`(args: js.Any*): GraphTraversal
  def math(args: js.Any*): GraphTraversal
  def max(args: js.Any*): GraphTraversal
  def mean(args: js.Any*): GraphTraversal
  def min(args: js.Any*): GraphTraversal
  def not(args: js.Any*): GraphTraversal
  def optional(args: js.Any*): GraphTraversal
  def or(args: js.Any*): GraphTraversal
  def order(args: js.Any*): GraphTraversal
  def otherV(args: js.Any*): GraphTraversal
  def out(args: js.Any*): GraphTraversal
  def outE(args: js.Any*): GraphTraversal
  def outV(args: js.Any*): GraphTraversal
  def path(args: js.Any*): GraphTraversal
  def project(args: js.Any*): GraphTraversal
  def properties(args: js.Any*): GraphTraversal
  def property(args: js.Any*): GraphTraversal
  def propertyMap(args: js.Any*): GraphTraversal
  def range(args: js.Any*): GraphTraversal
  def repeat(args: js.Any*): GraphTraversal
  def sack(args: js.Any*): GraphTraversal
  def sample(args: js.Any*): GraphTraversal
  def select(args: js.Any*): GraphTraversal
  def sideEffect(args: js.Any*): GraphTraversal
  def simplePath(args: js.Any*): GraphTraversal
  def skip(args: js.Any*): GraphTraversal
  def store(args: js.Any*): GraphTraversal
  def subgraph(args: js.Any*): GraphTraversal
  def sum(args: js.Any*): GraphTraversal
  def tail(args: js.Any*): GraphTraversal
  def timeLimit(args: js.Any*): GraphTraversal
  def times(args: js.Any*): GraphTraversal
  def to(args: js.Any*): GraphTraversal
  def toE(args: js.Any*): GraphTraversal
  def toV(args: js.Any*): GraphTraversal
  def tree(args: js.Any*): GraphTraversal
  def unfold(args: js.Any*): GraphTraversal
  def union(args: js.Any*): GraphTraversal
  def until(args: js.Any*): GraphTraversal
  def value(args: js.Any*): GraphTraversal
  def valueMap(args: js.Any*): GraphTraversal
  def values(args: js.Any*): GraphTraversal
  def where(args: js.Any*): GraphTraversal
}

object Statics_ {
  @scala.inline
  def apply(
    V: /* repeated */ js.Any => GraphTraversal,
    addE: /* repeated */ js.Any => GraphTraversal,
    addV: /* repeated */ js.Any => GraphTraversal,
    aggregate: /* repeated */ js.Any => GraphTraversal,
    and: /* repeated */ js.Any => GraphTraversal,
    as: /* repeated */ js.Any => GraphTraversal,
    barrier: /* repeated */ js.Any => GraphTraversal,
    both: /* repeated */ js.Any => GraphTraversal,
    bothE: /* repeated */ js.Any => GraphTraversal,
    bothV: /* repeated */ js.Any => GraphTraversal,
    branch: /* repeated */ js.Any => GraphTraversal,
    cap: /* repeated */ js.Any => GraphTraversal,
    choose: /* repeated */ js.Any => GraphTraversal,
    coalesce: /* repeated */ js.Any => GraphTraversal,
    coin: /* repeated */ js.Any => GraphTraversal,
    constant: /* repeated */ js.Any => GraphTraversal,
    count: /* repeated */ js.Any => GraphTraversal,
    cyclicPath: /* repeated */ js.Any => GraphTraversal,
    dedup: /* repeated */ js.Any => GraphTraversal,
    drop: /* repeated */ js.Any => GraphTraversal,
    emit: /* repeated */ js.Any => GraphTraversal,
    filter: /* repeated */ js.Any => GraphTraversal,
    flatMap: /* repeated */ js.Any => GraphTraversal,
    fold: /* repeated */ js.Any => GraphTraversal,
    group: /* repeated */ js.Any => GraphTraversal,
    groupCount: /* repeated */ js.Any => GraphTraversal,
    has: /* repeated */ js.Any => GraphTraversal,
    hasId: /* repeated */ js.Any => GraphTraversal,
    hasKey: /* repeated */ js.Any => GraphTraversal,
    hasLabel: /* repeated */ js.Any => GraphTraversal,
    hasNot: /* repeated */ js.Any => GraphTraversal,
    hasValue: /* repeated */ js.Any => GraphTraversal,
    id: /* repeated */ js.Any => GraphTraversal,
    identity: /* repeated */ js.Any => GraphTraversal,
    inE: /* repeated */ js.Any => GraphTraversal,
    inV: /* repeated */ js.Any => GraphTraversal,
    in_ : /* repeated */ js.Any => GraphTraversal,
    index: /* repeated */ js.Any => GraphTraversal,
    inject: /* repeated */ js.Any => GraphTraversal,
    is: /* repeated */ js.Any => GraphTraversal,
    key: /* repeated */ js.Any => GraphTraversal,
    label: /* repeated */ js.Any => GraphTraversal,
    limit: /* repeated */ js.Any => GraphTraversal,
    local: /* repeated */ js.Any => GraphTraversal,
    loops: /* repeated */ js.Any => GraphTraversal,
    map: /* repeated */ js.Any => GraphTraversal,
    `match`: /* repeated */ js.Any => GraphTraversal,
    math: /* repeated */ js.Any => GraphTraversal,
    max: /* repeated */ js.Any => GraphTraversal,
    mean: /* repeated */ js.Any => GraphTraversal,
    min: /* repeated */ js.Any => GraphTraversal,
    not: /* repeated */ js.Any => GraphTraversal,
    optional: /* repeated */ js.Any => GraphTraversal,
    or: /* repeated */ js.Any => GraphTraversal,
    order: /* repeated */ js.Any => GraphTraversal,
    otherV: /* repeated */ js.Any => GraphTraversal,
    out: /* repeated */ js.Any => GraphTraversal,
    outE: /* repeated */ js.Any => GraphTraversal,
    outV: /* repeated */ js.Any => GraphTraversal,
    path: /* repeated */ js.Any => GraphTraversal,
    project: /* repeated */ js.Any => GraphTraversal,
    properties: /* repeated */ js.Any => GraphTraversal,
    property: /* repeated */ js.Any => GraphTraversal,
    propertyMap: /* repeated */ js.Any => GraphTraversal,
    range: /* repeated */ js.Any => GraphTraversal,
    repeat: /* repeated */ js.Any => GraphTraversal,
    sack: /* repeated */ js.Any => GraphTraversal,
    sample: /* repeated */ js.Any => GraphTraversal,
    select: /* repeated */ js.Any => GraphTraversal,
    sideEffect: /* repeated */ js.Any => GraphTraversal,
    simplePath: /* repeated */ js.Any => GraphTraversal,
    skip: /* repeated */ js.Any => GraphTraversal,
    store: /* repeated */ js.Any => GraphTraversal,
    subgraph: /* repeated */ js.Any => GraphTraversal,
    sum: /* repeated */ js.Any => GraphTraversal,
    tail: /* repeated */ js.Any => GraphTraversal,
    timeLimit: /* repeated */ js.Any => GraphTraversal,
    times: /* repeated */ js.Any => GraphTraversal,
    to: /* repeated */ js.Any => GraphTraversal,
    toE: /* repeated */ js.Any => GraphTraversal,
    toV: /* repeated */ js.Any => GraphTraversal,
    tree: /* repeated */ js.Any => GraphTraversal,
    unfold: /* repeated */ js.Any => GraphTraversal,
    union: /* repeated */ js.Any => GraphTraversal,
    until: /* repeated */ js.Any => GraphTraversal,
    value: /* repeated */ js.Any => GraphTraversal,
    valueMap: /* repeated */ js.Any => GraphTraversal,
    values: /* repeated */ js.Any => GraphTraversal,
    where: /* repeated */ js.Any => GraphTraversal
  ): Statics_ = {
    val __obj = js.Dynamic.literal(V = js.Any.fromFunction1(V), addE = js.Any.fromFunction1(addE), addV = js.Any.fromFunction1(addV), aggregate = js.Any.fromFunction1(aggregate), and = js.Any.fromFunction1(and), as = js.Any.fromFunction1(as), barrier = js.Any.fromFunction1(barrier), both = js.Any.fromFunction1(both), bothE = js.Any.fromFunction1(bothE), bothV = js.Any.fromFunction1(bothV), branch = js.Any.fromFunction1(branch), cap = js.Any.fromFunction1(cap), choose = js.Any.fromFunction1(choose), coalesce = js.Any.fromFunction1(coalesce), coin = js.Any.fromFunction1(coin), constant = js.Any.fromFunction1(constant), count = js.Any.fromFunction1(count), cyclicPath = js.Any.fromFunction1(cyclicPath), dedup = js.Any.fromFunction1(dedup), drop = js.Any.fromFunction1(drop), emit = js.Any.fromFunction1(emit), filter = js.Any.fromFunction1(filter), flatMap = js.Any.fromFunction1(flatMap), fold = js.Any.fromFunction1(fold), group = js.Any.fromFunction1(group), groupCount = js.Any.fromFunction1(groupCount), has = js.Any.fromFunction1(has), hasId = js.Any.fromFunction1(hasId), hasKey = js.Any.fromFunction1(hasKey), hasLabel = js.Any.fromFunction1(hasLabel), hasNot = js.Any.fromFunction1(hasNot), hasValue = js.Any.fromFunction1(hasValue), id = js.Any.fromFunction1(id), identity = js.Any.fromFunction1(identity), inE = js.Any.fromFunction1(inE), inV = js.Any.fromFunction1(inV), in_ = js.Any.fromFunction1(in_), index = js.Any.fromFunction1(index), inject = js.Any.fromFunction1(inject), is = js.Any.fromFunction1(is), key = js.Any.fromFunction1(key), label = js.Any.fromFunction1(label), limit = js.Any.fromFunction1(limit), local = js.Any.fromFunction1(local), loops = js.Any.fromFunction1(loops), map = js.Any.fromFunction1(map), math = js.Any.fromFunction1(math), max = js.Any.fromFunction1(max), mean = js.Any.fromFunction1(mean), min = js.Any.fromFunction1(min), not = js.Any.fromFunction1(not), optional = js.Any.fromFunction1(optional), or = js.Any.fromFunction1(or), order = js.Any.fromFunction1(order), otherV = js.Any.fromFunction1(otherV), out = js.Any.fromFunction1(out), outE = js.Any.fromFunction1(outE), outV = js.Any.fromFunction1(outV), path = js.Any.fromFunction1(path), project = js.Any.fromFunction1(project), properties = js.Any.fromFunction1(properties), property = js.Any.fromFunction1(property), propertyMap = js.Any.fromFunction1(propertyMap), range = js.Any.fromFunction1(range), repeat = js.Any.fromFunction1(repeat), sack = js.Any.fromFunction1(sack), sample = js.Any.fromFunction1(sample), select = js.Any.fromFunction1(select), sideEffect = js.Any.fromFunction1(sideEffect), simplePath = js.Any.fromFunction1(simplePath), skip = js.Any.fromFunction1(skip), store = js.Any.fromFunction1(store), subgraph = js.Any.fromFunction1(subgraph), sum = js.Any.fromFunction1(sum), tail = js.Any.fromFunction1(tail), timeLimit = js.Any.fromFunction1(timeLimit), times = js.Any.fromFunction1(times), to = js.Any.fromFunction1(to), toE = js.Any.fromFunction1(toE), toV = js.Any.fromFunction1(toV), tree = js.Any.fromFunction1(tree), unfold = js.Any.fromFunction1(unfold), union = js.Any.fromFunction1(union), until = js.Any.fromFunction1(until), value = js.Any.fromFunction1(value), valueMap = js.Any.fromFunction1(valueMap), values = js.Any.fromFunction1(values), where = js.Any.fromFunction1(where))
    __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    __obj.asInstanceOf[Statics_]
  }
}

