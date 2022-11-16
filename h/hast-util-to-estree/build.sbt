organization := "org.scalablytyped"
name := "hast-util-to-estree"
version := "2.1.0-d72f7a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-9e7169",
  "org.scalablytyped" %%% "estree-jsx" % "0.0.1-89435b",
  "org.scalablytyped" %%% "hast" % "2.3-dt-20211202Z-03b568",
  "org.scalablytyped" %%% "mdast" % "3.0-dt-20211202Z-627ab0",
  "org.scalablytyped" %%% "mdast-util-from-markdown" % "1.2.0-f0ca54",
  "org.scalablytyped" %%% "mdast-util-mdx-expression" % "1.3.0-b6b9d8",
  "org.scalablytyped" %%% "mdast-util-mdx-jsx" % "2.1.0-a9f415",
  "org.scalablytyped" %%% "mdast-util-mdxjs-esm" % "1.3.0-25ea9b",
  "org.scalablytyped" %%% "mdast-util-to-markdown" % "1.3.0-baeeb7",
  "org.scalablytyped" %%% "micromark-util-types" % "1.0.2-dfb004",
  "org.scalablytyped" %%% "property-information" % "6.1.1-6cd187",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20220624Z-b11504")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
