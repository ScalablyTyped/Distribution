organization := "org.scalablytyped"
name := "ionic"
version := "5.4.16-852d52"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20201014Z-4f2556",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20200226Z-939b6e",
  "org.scalablytyped" %%% "elementtree" % "0.1-dt-20180830Z-6a95b6",
  "org.scalablytyped" %%% "inquirer" % "7.3-dt-20200820Z-2d7140",
  "org.scalablytyped" %%% "ionic__cli-framework" % "3.0.6-77a812",
  "org.scalablytyped" %%% "ionic__cli-framework-prompts" % "1.0.4-b64759",
  "org.scalablytyped" %%% "ionic__discover" % "2.0.8-22ed81",
  "org.scalablytyped" %%% "ionic__utils-network" % "1.0.6-108c55",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.6-9ae996",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "1.0.13-bd8bf2",
  "org.scalablytyped" %%% "log-update" % "4.0.0-b020b0",
  "org.scalablytyped" %%% "minimist" % "1.2-dt-20201106Z-23b986",
  "org.scalablytyped" %%% "minipass" % "2.2-dt-20200713Z-ed8d23",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "rxjs" % "6.6.3-e772da",
  "org.scalablytyped" %%% "rxjs-compat" % "6.6.3-e1471b",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "string-width" % "4.2.0-c30181",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20200825Z-6fc83a",
  "org.scalablytyped" %%% "tar" % "4.0-dt-20201117Z-c1413f",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20201002Z-81a546",
  "org.scalablytyped" %%% "ws" % "7.4-dt-20201109Z-9be819")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
