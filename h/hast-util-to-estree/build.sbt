organization := "org.scalablytyped"
name := "hast-util-to-estree"
version := "2.1.0-617a5b"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-e2199b",
  "org.scalablytyped" %%% "estree-jsx" % "0.0.1-fae4f5",
  "org.scalablytyped" %%% "hast" % "2.3-dt-20211202Z-8fd1f7",
  "org.scalablytyped" %%% "mdast" % "3.0-dt-20211202Z-995551",
  "org.scalablytyped" %%% "mdast-util-from-markdown" % "1.2.0-c077a7",
  "org.scalablytyped" %%% "mdast-util-mdx-expression" % "1.3.0-022577",
  "org.scalablytyped" %%% "mdast-util-mdx-jsx" % "2.1.0-2bdfba",
  "org.scalablytyped" %%% "mdast-util-mdxjs-esm" % "1.3.0-37bce8",
  "org.scalablytyped" %%% "mdast-util-to-markdown" % "1.3.0-1adb80",
  "org.scalablytyped" %%% "micromark-util-types" % "1.0.2-b2fa79",
  "org.scalablytyped" %%% "property-information" % "6.1.1-ee13fb",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20220624Z-e82c50")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
