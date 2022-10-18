organization := "org.scalablytyped"
name := "hast-util-to-estree"
version := "2.1.0-7b6a9b"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-9389e9",
  "org.scalablytyped" %%% "estree-jsx" % "0.0.1-49c4cc",
  "org.scalablytyped" %%% "hast" % "2.3-dt-20211202Z-e1d44f",
  "org.scalablytyped" %%% "mdast" % "3.0-dt-20211202Z-e12bb0",
  "org.scalablytyped" %%% "mdast-util-from-markdown" % "1.2.0-30618b",
  "org.scalablytyped" %%% "mdast-util-mdx-expression" % "1.3.0-1327cd",
  "org.scalablytyped" %%% "mdast-util-mdx-jsx" % "2.1.0-561a48",
  "org.scalablytyped" %%% "mdast-util-mdxjs-esm" % "1.3.0-dca91c",
  "org.scalablytyped" %%% "mdast-util-to-markdown" % "1.3.0-b4e699",
  "org.scalablytyped" %%% "micromark-util-types" % "1.0.2-5edda3",
  "org.scalablytyped" %%% "property-information" % "6.1.1-e594cf",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20220624Z-e61dba")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
